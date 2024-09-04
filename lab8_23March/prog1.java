// 1. A plastic manufacturer sells plastic in different shapes like 2D sheet and 3D box. The cost of sheet is
// Rs 40/ per square ft. and the cost of box is Rs 60/ per cubic ft. Implement it in Java to calculate the cost
// of plastic as per the

// dimensions given by the user where 3D inherits from 2D.
package lab8_23March;

class twoD {
    int length;
    int breadth;
    twoD(){}
}
class threeD extends twoD{
    int s_price=40;
    int b_price=60;
    int height;
    threeD(int l,int b){
        length=l;
        breadth=b;
        System.out.println("The cost of sheet is: " + (l*b)*s_price);
    }
    threeD(int l,int b,int h){
        length=l;
        breadth=b;
        height=h;
        System.out.println("The cost of sheet is: " + (l*b*h)*b_price);
    }
}
public class prog1 {
    public static void main(String[] args) {
        threeD t1 = new threeD(4, 5);
        threeD t2 = new threeD(4, 5,6);
        
    }
}
