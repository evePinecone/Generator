package ua.khpi.pinecone.utils;

import java.util.ArrayList;
import java.util.List;

public class ArithmeticsUtils {

    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static int lcm(int a, int b) {
        return a / gcd(a, b) * b;
    }

    public static int pow(int a, int b) {
        int ans = 1;
        for (int i = 0; i < b; i++) {
            ans *= a;
        }
        return ans;
    }

    public static List<List<Integer>> splitNumber(Integer degree) {
        List<List<Integer>> splitNumbers = new ArrayList<>();
        int l = degree;
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < degree; i++) {
            arr.add(1);
        }
        splitNumbers.add(new ArrayList<>(arr));

        do {
            l = next(arr, l);
            splitNumbers.add(new ArrayList<>(arr.subList(0, l)));
        } while (l > 1);

        System.out.println(splitNumbers);
        return splitNumbers;
    }

    static int next(List<Integer> arr, Integer l) {
        int i = l - 1;
        int sum = 0;

        do {
            sum += arr.get(i--);
        } while (i > 0 && arr.get(i - 1) <= arr.get(i));

        arr.set(i, arr.get(i) + 1);
        l = i + sum;

        for (int j = i + 1; j < l; j++) {
            arr.set(j, 1);
        }
        return l;
    }
}
