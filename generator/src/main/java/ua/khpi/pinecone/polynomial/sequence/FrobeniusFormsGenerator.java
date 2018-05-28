package ua.khpi.pinecone.polynomial.sequence;

import ua.khpi.pinecone.report.Report;
import ua.khpi.pinecone.utils.ArithmeticsUtils;
import ua.khpi.pinecone.utils.MatrixUtils;

import java.util.ArrayList;
import java.util.List;

public class FrobeniusFormsGenerator {

    private Report report;
    private List<List<Integer>> baseSequence = new ArrayList<>();

    public FrobeniusFormsGenerator(Report report) {
        this.report = report;
        generateFrobeniusForms();
    }

    private void generateFrobeniusForms() {
        Integer degree = report.getDegree();
        setBaseSequence(degree);
        List<List<Integer>> splitBlocks = ArithmeticsUtils.splitNumber(degree);

        List<List<Integer>> temp;

        for (int splitLine = 0; splitLine < splitBlocks.size(); splitLine++) {
            temp = new ArrayList<>();
            int position = 0;
            List<Integer> line = splitBlocks.get(splitLine);
            for (int splitColumn = 0; splitColumn < line.size(); splitColumn++) {
                List<Integer> list = new ArrayList<>(baseSequence.get(position));
                list.set(position, 1);
                temp.add(list);
                for (int i = position + 1; i < line.get(splitColumn) + position; i++) {
                    list = new ArrayList<>(baseSequence.get(i));
                    temp.add(list);
                }
                position += line.get(splitColumn);
            }
            report.addSequencesFrobenius(new ArrayList<>(temp), MatrixUtils.generateSequenceAndCalculateWeightHamming(temp, report));
        }

        //TODO: to generate random polynomial sequence;
//        Map<String, List<PolynomialEntity>> polynomialsMap = report.getPolynomials();
//
//
//
//        List<PolynomialEntity> polynomials = polynomialsMap.get(degree.toString());
//
//        List<List<Integer>> polynomial = PolynomialGenerator
//                .generatePolynomialA(degree.toString(), polynomials.get(1).getName());
//        report.addSequencesFrobenius(polynomial, 0);
    }

    private void setBaseSequence(Integer degree) {
        baseSequence = new ArrayList<>();
        for (int i = 0; i < degree; i++) {
            List<Integer> internalSequence = new ArrayList<>(degree);
            for (int j = 0; j < degree; j++) {
                internalSequence.add(0);
            }
            baseSequence.add(internalSequence);
        }
    }
}
