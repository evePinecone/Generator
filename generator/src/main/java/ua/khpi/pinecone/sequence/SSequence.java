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
        processFileFromFolder(new File("S/S"));
        LOG.info("Available sequence read from file");
    }

    private void processFileFromFolder(File filePath) {
        try (Scanner scanner = new Scanner(filePath)) {
            List<Integer> list = new ArrayList<>();
            int size = scanner.nextInt();

            while (scanner.hasNext()) {
                for(int i = 0; i < size; i++) {
                    list.add(Integer.parseInt(scanner.next()));
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
