package ua.khpi.pinecone.utils;

import java.util.ArrayList;
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

}
