// WAP to print “An object is created” everytime when you create an object of a
// class.
package lab6_2March;

class A{
    A(){System.out.println("An object is created\n");}
}
public class prog2 {
    public static void main(String[] args){
        A a1 = new A();
        A a2 = new A();
        A a3 = new A();
    }
}