package ua.khpi.pinecone.answer;

import java.util.ArrayList;
import java.util.List;

public class ReportEntity {

    private List<List<Integer>> a;
    private List<List<Integer>> b;
    private List<List<List<Integer>>> sequences = new ArrayList<>();

    private Integer periodA;
    private Integer periodB;
    private Integer estimatedPeriod;
    private Integer hammingWeight;
    private Integer steps;

    public List<List<Integer>> getA() {
        return a;
    }

    public void setA(List<List<Integer>> a) {
        this.a = a;
    }

    public List<List<Integer>> getB() {
        return b;
    }

    public void setB(List<List<Integer>> b) {
        this.b = b;
    }

    public void addSequence(List<List<Integer>> sequence) {
        sequences.add(sequence);
    }

    public Integer getPeriodA() {
        return periodA;
    }

    public void setPeriodA(Integer periodA) {
        this.periodA = periodA;
    }

    public Integer getPeriodB() {
        return periodB;
    }

    public void setPeriodB(Integer periodB) {
        this.periodB = periodB;
    }

    public Integer getEstimatedPeriod() {
        return estimatedPeriod;
    }

    public void setEstimatedPeriod(Integer estimatedPeriod) {
        this.estimatedPeriod = estimatedPeriod;
    }

    public Integer getHammingWeight() {
        return hammingWeight;
    }

    public void setHammingWeight(Integer hammingWeight) {
        this.hammingWeight = hammingWeight;
    }

    public void makeStep(){
        steps++;
    }

    public Integer getSteps() {
        return steps;
    }

    public void setSequences(List<List<List<Integer>>> sequences) {
        this.sequences = sequences;
    }
}
