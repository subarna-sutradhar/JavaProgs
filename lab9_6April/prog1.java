// 1. llustrate the usage of abstract class with following Java classes –

// i>An abstract class „student‟ with data member roll no, reg no and an abstract method course()

// ii>A subclass „kiitian‟ with course() method implementation

package lab9_6April;

abstract class student{
    int roll=4;
    int reg=1001;
    abstract void course();
}
class kiitian extends student{
    void course(){
        System.out.println("The roll is " + roll);
        System.out.println("The regno is " + reg);
        System.out.println("course BTECH");
    }
}
public class prog1 {
    public static void main(String[] args) {
        kiitian k;
        k = new kiitian();
        k.course();
    }
}
