package ua.khpi.pinecone.sequence;

import org.apache.log4j.Logger;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SSequence {

    private static Logger LOG = Logger.getLogger(SSequence.class);
    private List<List<Integer>> sequence = new ArrayList<>();

    public SSequence() {
        processFileFromFolder(new File("S\\S.txt"));
        LOG.info("Available sequence read from file");
    }

    private void processFileFromFolder(File filePath) {
        try (Scanner scanner = new Scanner(filePath)) {
            int size = scanner.nextInt();

            for (int j = 0; j < size; j++) {
                List<Integer> list = new ArrayList<>();
                for (int i = 0; i < size; i++) {
                    list.add(scanner.nextInt());
                }
                sequence.add(list);
            }
        } catch (FileNotFoundException e) {
            LOG.error("Polynomial file not found", e);
        }
    }

    public List<List<Integer>> getSequence() {
        return sequence;
    }
}
