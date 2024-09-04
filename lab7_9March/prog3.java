// WAP to overload the area method which will find the area of a circle and area of a
// rectangle
package lab7_9March;
class Cal{
    static double area(double b){
        return 3.14*b*b;
    }
    static int area(int a,int b){
        return a*b;
    }
}
public class prog3 {
    public static void main(String[] args) {
        System.out.println(Cal.area(4.5));
        System.out.println(Cal.area(4,3));
    }
}
