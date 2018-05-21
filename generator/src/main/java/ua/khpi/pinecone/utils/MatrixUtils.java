package ua.khpi.pinecone.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MatrixUtils {

    public static <T> List<List<T>> transposeListOfLists(List<List<T>> table) {
        List<List<T>> ret = new ArrayList<List<T>>();
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
                for (int k = 0; k < B.size(); k++) {
                    kArr[i][j] += aArr[i][k] * bArr[k][j];
                }
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

        for (int i = 0; i < list.size(); i++) {
            list.add(Arrays.asList(arr[i]));
        }

        return list;
    }


}