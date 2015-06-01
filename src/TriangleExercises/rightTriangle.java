package TriangleExercises;

import java.util.Scanner;

/**
 * Created by Eugene on 5/30/2015.
 */
public class rightTriangle {
    public static void main(String[] args) {
        System.out.print("How big do you want the right triangle to be? ");
        int n = new Scanner(System.in).nextInt();
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < i; j ++){
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
}
