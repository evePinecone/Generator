package ua.khpi.pinecone.utils;

import ua.khpi.pinecone.report.Report;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MatrixUtils {

    public static <T> List<List<T>> transposeListOfLists(List<List<T>> table) {
        List<List<T>> ret = new ArrayList<>();
        final int N = table.get(0).size();
        for (int i = 0; i < N; i++) {
            List<T> col = new ArrayList<T>();
            for (List<T> row : table) {
                col.add(row.get(i));
            }
            ret.add(col);
        }
        return ret;
    }

    public static List<List<Integer>> multByModulo(List<List<Integer>> A, List<List<Integer>> B) {
        List<List<Integer>> multSequence = new ArrayList<>();

        Integer[][] aArr = listMatrixToArrayMatrix(A);
        Integer[][] bArr = listMatrixToArrayMatrix(B);
        Integer[][] kArr = new Integer[A.size()][A.size()];

        for (int i = 0; i < A.size(); i++) {
            for (int j = 0; j < B.size(); j++) {

                kArr[i][j] = 0;
            }
        }

        for (int i = 0; i < A.size(); i++) {
            for (int j = 0; j < B.size(); j++) {
                for (int k = 0; k < B.size(); k++) {
                    kArr[i][j] += aArr[i][k] * bArr[k][j];
                }
                kArr[i][j] %= 2;
            }

        }

        return arrMatrixToListMatrix(kArr);
    }

    private static Integer[][] listMatrixToArrayMatrix(List<List<Integer>> list) {
        Integer[][] arr = new Integer[list.size()][list.size()];

        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i).toArray(new Integer[list.size()]);
        }

        return arr;
    }

    private static List<List<Integer>> arrMatrixToListMatrix(Integer[][] arr) {
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < arr[0].length; i++) {
            list.add(Arrays.asList(arr[i]));
        }

        return list;
    }

    public static String listPolynomialToString(List<List<Integer>> polynomial) {
        StringBuilder text = new StringBuilder();
        for (List<Integer> list : polynomial) {
            for (Integer integer : list) {
                text.append(integer).append(" ");
            }
            text.append(System.lineSeparator());
        }
        return text.toString();
    }


    public static Integer generateSequenceAndCalculateWeightHamming(List<List<Integer>> baseSequence, Report report){
        Integer weight = 0;

        List<List<Integer>> sequence = new ArrayList<>(baseSequence);

        for(int i = 0; i < report.getPeriodA(); i++) {
            if(sequence.get(0).get(0).equals(1)) {
                weight++;
            }
            sequence = MatrixUtils.multByModulo(report.getA(),sequence);
            sequence = MatrixUtils.multByModulo(sequence,report.getB());
        }
        return weight;
    }
}