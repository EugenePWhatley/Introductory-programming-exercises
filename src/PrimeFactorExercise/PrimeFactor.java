package PrimeFactorExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Eugene on 5/30/2015.
 */
public class PrimeFactor {
    public static void main(String[] args) {
        System.out.print("Give a valid integer: ");
        List<Integer> primeNumbers = generate(new Scanner(System.in).nextInt());
        for (Integer primeNumber : primeNumbers) {
            System.out.print(primeNumber + ", ");
        }
    }
    private static List<Integer> generate(int n) {
        List<Integer> prime = new ArrayList<>();
        for(int i = 2; i < n; i++) {
            if(n%i==0) {
                if (isPrime(i)) {
                    prime.add(i);
                }
            }
        }
        return prime;
    }
    private static boolean isPrime(int n) {
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
