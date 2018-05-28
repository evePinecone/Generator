package ua.khpi.pinecone.answer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

public class WriteReportToFile {

    private Report report;
    private String fileNameSmith =  "S\\smithForm.txt";
    private String fileNameFrobenius =  "S\\frobeniusForm.txt";


    public WriteReportToFile(Report report) {
        this.report = report;
        removeFiles();
        writeSmithFormsToFile();
        writeFrobeniusFormsToFile();
    }

    private void writeFrobeniusFormsToFile() {
        try (FileWriter fw = new FileWriter(fileNameFrobenius, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {
            out.println(frobeniusFormsString());
        } catch (IOException e) {
        }
    }

    private void writeSmithFormsToFile() {
        try (FileWriter fw = new FileWriter(fileNameSmith, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {
            out.println(smithFormsString());
        } catch (IOException e) {
        }
    }

    private void  removeFiles() {
        File smith = new File(fileNameSmith);
        smith.delete();
        File frobenius = new File(fileNameFrobenius);
        frobenius.delete();
    }

    private String frobeniusFormsString() {
        Map<List<List<Integer>>, Integer> frobeniusForms = report.getSequencesFrobenius();

        StringBuilder sb = new StringBuilder();

        sb.append("Frobenius forms of the base polynomial sequence").append(System.lineSeparator());
        for (Map.Entry<List<List<Integer>>, Integer> listIntegerEntry : frobeniusForms.entrySet()) {
            for (int i = 0; i < listIntegerEntry.getKey().size(); i++) {
                sb.append(listIntegerEntry.getKey().get(i)).append(System.lineSeparator());
            }
            sb.append("Weight Hamming = ").append(listIntegerEntry.getValue()).append(System.lineSeparator());
            sb.append("_______________________").append(System.lineSeparator());
        }
        return sb.toString();
    }

    private String smithFormsString() {
        Map<List<List<Integer>>, Integer> smithForms = report.getSequencesSmith();

        StringBuilder sb = new StringBuilder();

        sb.append("Smith forms of the base polynomial sequence").append(System.lineSeparator());
        for (Map.Entry<List<List<Integer>>, Integer> listIntegerEntry : smithForms.entrySet()) {
            for (int i = 0; i < listIntegerEntry.getKey().size(); i++) {
                sb.append(listIntegerEntry.getKey().get(i)).append(System.lineSeparator());
            }
            sb.append("Weight Hamming = ").append(listIntegerEntry.getValue()).append(System.lineSeparator());
            sb.append("_______________________").append(System.lineSeparator());
        }
        return sb.toString();
    }
}
