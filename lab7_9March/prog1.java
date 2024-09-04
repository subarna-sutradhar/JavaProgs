// WAP to declare a 2x2 multi-dimensional array, initialize it and find the sum of left
// diagonal and right diagonal.
package lab7_9March;

public class prog1 {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2 }, { 3, 4 } };
        int ltd = 0;
        int rtd = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (i == j) {
                    rtd += arr[i][j];
                }
                if ((i + j)==1) {
                    ltd += arr[i][j];
                }
            }
        }
        System.out.println("Sum of left diagonal: " + ltd);
        System.out.println("\nSum of right diagonal: " + rtd);

    }

}
