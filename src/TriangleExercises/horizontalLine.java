package TriangleExercises;

import java.util.Scanner;

/**
 * Created by Eugene on 5/30/2015.
 */
public class horizontalLine {
    public static void main(String[] args) {
        System.out.print("How long do you want the line to be? ");
        int n = new Scanner(System.in).nextInt();
        for(int i = 0; i < n; i++) {
            System.out.print("*");
        }
    }
}
