package DiamondExercises;

import java.util.Scanner;

/**
 * Created by Eugene on 5/30/2015.
 */
public class Diamond {
    public static void main(String[] args) {
        System.out.print("How big do you want the Diamond to be? ");
        int n = new Scanner(System.in).nextInt();
        for (int i = 1; i <= n; i++) {
            for(int j = i; j < n;j++) {
                System.out.print(" ");
            }
            for(int j = 0; j <(i*2-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n-1; i >= 0; i--) {
            for(int j = n; j > i;j--) {
                System.out.print(" ");
            }
            for(int j = (i*2-1); j > 0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
