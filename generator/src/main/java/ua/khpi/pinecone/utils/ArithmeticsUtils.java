package ua.khpi.pinecone.utils;

public class ArithmeticsUtils {

    public static int gcd(int a,int b){
        return b == 0 ? a : gcd(b,a % b);
    }

    public static int lcm(int a,int b){
        return a / gcd(a,b) * b;
    }

    public static int pow(int a, int b) {
        int ans = 1;
        for(int i = 0; i < b; i++) {
            ans*=a;
        }
        return ans;
    }
}
