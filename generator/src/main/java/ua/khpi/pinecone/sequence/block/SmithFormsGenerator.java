package ua.khpi.pinecone.sequence.block;

import ua.khpi.pinecone.answer.Report;
import ua.khpi.pinecone.utils.MatrixUtils;

import java.util.ArrayList;
import java.util.List;

public class SmithFormsGenerator {

    private Report report;
    private List<List<Integer>> baseSequence;

    public SmithFormsGenerator(Report report) {
        this.report = report;
        generateSmithSequences();
    }

    private void generateSmithSequences() {
        Integer degree = report.getDegree();
        setBaseSequence(degree);

        for (int i = 0; i < degree; i++) {
            List<Integer> temp = new ArrayList<>(baseSequence.get(i));
            temp.set(i, 1);
            baseSequence.set(i, temp);
            report.addSequenceSmith(new ArrayList<>(baseSequence), MatrixUtils.generateSequenceAndCalculateWeightHamming(baseSequence, report));
        }
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
