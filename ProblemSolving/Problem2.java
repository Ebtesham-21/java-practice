package ProblemSolving;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Rows: ");
        int rows = sc.nextInt();
        System.out.print("Col: ");
        int col = sc.nextInt();
        if (rows <= 0 || col <= 0) {
            System.out.print("Please enter more than one");
        } else {
            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= col; j++) {
                    System.out.print("B");
                }
                System.out.println();

            }
        }

    }

}
