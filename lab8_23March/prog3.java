// 3. Write a program in java using inheritance to show how to call the base class parameterized
// constructors from the derived class using super.
package lab8_23March;

class A{
    A(){};
    A(int a){
        System.out.println("I am A");
    }
}
class B extends A{
    B(){};
    B(int b){
        super(b);
        System.out.println("I am B");
    }
}
public class prog3 {
    public static void main(String[] args) {
        B b = new B(2);
    }
}
