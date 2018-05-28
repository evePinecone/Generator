package ua.khpi.pinecone.report;

import ua.khpi.pinecone.polynomial.PolynomialEntity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Report {

    private List<List<Integer>> a;
    private List<List<Integer>> b;
    private List<List<List<Integer>>> sequences = new ArrayList<>();
    private Map<List<List<Integer>>, Integer> sequencesSmith = new HashMap<>();
    private Map<List<List<Integer>>, Integer> sequencesFrobenius = new HashMap<>();

    private  Map<String, List<PolynomialEntity>> polynomials = new HashMap<>();

    private Integer degree;
    private Integer periodA;
    private Integer periodB;
    private Integer estimatedPeriod;
    private Integer hammingWeight;
    private Integer steps;

    public void addSequenceSmith(List<List<Integer>> sequenceSmith, Integer hammingWeight) {
        this.sequencesSmith.put(sequenceSmith, hammingWeight);
    }

    public void addSequencesFrobenius(List<List<Integer>> sequenceFrobenius, Integer hammingWeight) {
        this.sequencesFrobenius.put(sequenceFrobenius, hammingWeight);
    }

    public Map<List<List<Integer>>, Integer> getSequencesSmith() {
        return sequencesSmith;
    }

    public Map<List<List<Integer>>, Integer> getSequencesFrobenius() {
        return sequencesFrobenius;
    }

    public Integer getDegree() {
        return degree;
    }

    public void setDegree(Integer degree) {
        this.degree = degree;
    }

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

    public void makeStep() {
        steps++;
    }

    public Integer getSteps() {
        return steps;
    }

    public List<List<List<Integer>>> getSequences() {
        return sequences;
    }

    public Map<String, List<PolynomialEntity>> getPolynomials() {
        return polynomials;
    }

    public void setPolynomials(Map<String, List<PolynomialEntity>> polynomials) {
        this.polynomials = polynomials;
    }
}
