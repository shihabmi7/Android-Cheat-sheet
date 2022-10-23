package misc;

public class PrimeNumber {

    static  boolean checkPrime(int value) {
        int m = value / 2;
        for (int i = 2; i < m; i++) {
            if (value % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        System.out.println(checkPrime(17));
    }
}
