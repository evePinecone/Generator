package ua.khpi.pinecone.polynomial;

import ua.khpi.pinecone.report.Report;
import ua.khpi.pinecone.utils.MatrixUtils;

import java.util.List;

public class GenerateInvertible {

    private Report report;

    public GenerateInvertible(Report report) {
        this.report = report;
    }

    public List<List<Integer>> generateInvertible(List<List<Integer>> inputPolynomial) {
        List<List<Integer>> generatedMatrix = inputPolynomial;
        for(int i = 0; i < report.getPeriodB()-2; i++) {
            generatedMatrix = MatrixUtils.multByModulo(generatedMatrix, inputPolynomial);
        }
        return generatedMatrix;
    }

}
