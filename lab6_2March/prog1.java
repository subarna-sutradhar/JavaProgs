// 1. WAP to print tables of any input number from (1-10) using loop.
package lab6_2March;
import java.util.Scanner;
public class prog1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        System.out.println("The table is\n");
        for(int i=1;i<=10;i++){
            System.out.println(num*i);
        }

    }
}