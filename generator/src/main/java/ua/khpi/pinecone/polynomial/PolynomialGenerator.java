package ua.khpi.pinecone.polynomial;

import org.apache.commons.lang3.CharUtils;
import org.apache.log4j.Logger;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class PolynomialGenerator {

    private static Logger LOG = Logger.getLogger(PolynomialGenerator.class);

    private Map<String, List<PolynomialEntity>> polynomials;

    public PolynomialGenerator() {
        polynomials = new TreeMap<>();
        polynomials.put("", new ArrayList<>());
        processFilesFromFolder(new File("polynomials"));
        LOG.info("Available polynomials read from file");
    }

    private void processFilesFromFolder(File folder) {
        File[] folderEntries = folder.listFiles();
        for (File entry : folderEntries) {
            if (entry.isDirectory()) {
                processFilesFromFolder(entry);
                continue;
            }
            List<PolynomialEntity> listOfNames = new ArrayList<>();
            listOfNames.add(new PolynomialEntity("",""));

            try (Scanner scanner = new Scanner(entry)) {
                while (scanner.hasNext()) {
                    listOfNames.add(new PolynomialEntity(scanner.next(), scanner.next()));
                }
            } catch (FileNotFoundException e) {
                LOG.error("Polynomial file not found", e);
            }
            polynomials.put(entry.getName().split("_")[0], listOfNames);
        }
    }

    public static List<List<Integer>> generatePolynomialA(String degree, String octalPolynomial) {
        List<List<Integer>> polynomial = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Integer intDegree = Integer.parseInt(degree);

        toBinarySequence(octalPolynomial, list, intDegree);
        polynomial.add(list);
        for(int i = 0; i < intDegree-1; i++) {
            List<Integer> listDefault = new ArrayList<>();
            for (int j = 0; j < intDegree; j++) {
                if(j == i) {
                    listDefault.add(1);
                } else {
                    listDefault.add(0);
                }
            }
            polynomial.add(listDefault);
        }
        return polynomial;
    }

    public static List<List<Integer>> generatePolynomialB(String degree, String octalPolynomial) {
        List<List<Integer>> polynomial = new ArrayList<>();
        List<Integer> binaryList = new ArrayList<>();
        Integer intDegree = Integer.parseInt(degree);

        toBinarySequence(octalPolynomial, binaryList, intDegree);
        for (int i = 0; i < intDegree; i++) {
            List<Integer> tempList = new ArrayList<>();
            tempList.add(binaryList.get(i));
            for(int j = 1; j < intDegree; j++) {
                if(j == i+1) {
                    tempList.add(1);
                } else {
                    tempList.add(0);
                }
            }
            polynomial.add(tempList);
        }
        return polynomial;
    }

    private static void toBinarySequence(String octalPolynomial, List<Integer> list, Integer intDegree) {
        for (int i = 0; i < octalPolynomial.length(); i++) {
            Character ch = octalPolynomial.charAt(i);
            if (CharUtils.isAsciiNumeric(ch)) {
                String binaryString = Integer.toBinaryString(CharUtils.toIntValue(ch));
                while (binaryString.length() < 3) {
                    binaryString = "0" + binaryString;
                }
                for (int j = 0; j < binaryString.length(); j++) {
                    list.add(CharUtils.toIntValue(binaryString.charAt(j)));
                }
            }
        }
        if (!list.isEmpty()) {
            while (list.size() > intDegree) {
                list.remove(0);
            }
        }
    }

    public Map<String, List<PolynomialEntity>> getPolynomials() {
        return polynomials;
    }
}
