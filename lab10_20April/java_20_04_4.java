import java.util.Scanner;
public class java_20_04_4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String str = sc.nextLine();

    System.out.print("Enter another string: ");
    String str1 = sc.nextLine();

    System.out.println("String in upper case: " + str.toUpperCase());
    System.out.println("String in lower case: " + str.toLowerCase());

    System.out.println("Reversed string: " + new StringBuffer(str).reverse());

    if(str.equals(str1)){
      System.out.println("Strings are equal");
    }
    else {
      System.out.println("Strings are not equal");
    }

    System.out.println("Enter the index where you want to insert the string: ");
    int index = sc.nextInt();
    System.out.println("String after insertion: " + str.substring(0, index) + str1 + str.substring(index));
  }
}
