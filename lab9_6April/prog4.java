// 4. WAP so that it generates Arithmatic Exception and ArrayIndexOut of Bounds Exception and handle it using Try-catch
// block

package lab9_6April;

public class prog4 {
    public static void main(String[] args) {
        try {
            int num1 = 10;
            int num2 = 0;
            int ans = num1 / num2;
            System.out.println("Result: " + ans);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }

        try {
            int[] arr = {1, 2, 3, 4, 5};
            int item = arr[8];
            System.out.println("Value: " + item);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
