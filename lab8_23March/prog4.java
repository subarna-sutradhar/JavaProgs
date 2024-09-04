// 4. Write a program in java to define a class Shape which has data member „area‟ and a member
// function showArea(). Derive two classes Circle and Rectangle from Shape class. Add appropriate data
// members and member functions to calculate and display the area of Circle and Rectangle.
package lab8_23March;

class Shape{
    double area;
    void showArea(){
        System.out.println("The area is "+ area);
    }
}
class Circle extends Shape{
    double pi=3.14;
    double r = 4.5;
    Circle(){
        area = pi*r*r;
    }
    @Override
    void showArea() {
        // TODO Auto-generated method stub
        super.showArea();
    }
}
class Rectangle extends Shape{
    double length=5.4;
    double breadth=8.9;
    Rectangle(){
        area = length*breadth;
    }
    @Override
    void showArea() {
        // TODO Auto-generated method stub
        super.showArea();
    }
}
public class prog4 {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Rectangle r1 = new Rectangle();
        c1.showArea();
        r1.showArea();
    }
}
