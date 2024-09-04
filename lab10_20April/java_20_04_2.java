import java.util.Scanner;
class HrsException extends Exception {
  public HrsException(String message) {
    super(message);
  }
}
class MinException extends Exception {
  public MinException(String message) {
    super(message);
  }
}
class SecException extends Exception {
  public SecException(String message) {
    super(message);
  }
}
public class java_20_04_2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter hours: ");
    int hrs = sc.nextInt();
    System.out.print("Enter minutes: ");
    int min = sc.nextInt();
    System.out.print("Enter seconds: ");
    int sec = sc.nextInt();
    try {
      Time(hrs, min, sec);
    }
    catch(HrsException e) {
      System.out.println("Error: " + e.getMessage());
    }
    catch(MinException e) {
      System.out.println("Error: " + e.getMessage());
    }
    catch(SecException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }
  public static void Time(int hrs, int min, int sec) throws HrsException, MinException, SecException {
    if(hrs > 24 || hrs < 0) {
      throw new HrsException("Invalid hours");
    }
    else if(min > 60 || min < 0) {
      throw new MinException("Invalid minutes");
    }
    else if(sec > 60 || sec < 0) {
      throw new SecException("Invalid seconds");
    }
    else {
      System.out.println("Time is: " + hrs + ":" + min + ":" + sec);
    }
  }
}
