import java.util.Scanner;
public class java_20_04_5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String str = sc.nextLine();

    int vowels = 0, numbers = 0, special = 0, words = 1;

    for(int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);

      if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
        vowels++;
      }

      else if(ch >= '0' && ch <= '9') {
        numbers++;
      }

      else if(ch == ' ') {
        words++;
      }
    }
    System.out.println("Vowels: " + vowels);
    System.out.println("Numbers: " + numbers);
    System.out.println("Words: " + words);
    if(str.equals(new StringBuffer(str).reverse().toString())) {
      System.out.println("Palindrome");
    }
    else {
      System.out.println("Not a palindrome");
    }
  }
}
