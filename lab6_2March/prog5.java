package lab6_2March;
class C{
    static int count=0;
    C(){
        count += 1;
        System.out.println("This is " + count + "th object created\n");
    }
}
public class prog5 {
    public static void main(String[] args) {
        C a1=new C();
        C a2=new C();
        C a3=new C();
    }
}
