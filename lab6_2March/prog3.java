// 3. WAP to print “This is ____ th object created” when an object will be created
package lab6_2March;
class B{
    private int count;
    B(int i){
        count=i;
        System.out.println("This is " + count + "th object created\n");
    }
}
public class prog3 {
    public static void main(String[] args) {
        B a1=new B(1);
        B a2=new B(2);
        B a3=new B(3);
    }
}
