// 2. Write a program to create an Account class containing acc_no, balance as data members and disp() to
// display the details. Inherit it in Person class with all mentioned data members and functions. Person
// class also has name and

// aadhar_no as extra data members of its own. Override disp() function. Create 2 persons‟ details.
package lab8_23March;


class Account{
    int acc_no;
    int balance;
    void disp(){
        System.out.println("The account no is: " + acc_no);
        System.out.println("The account balance is: " + balance);
    }
}
class Person extends Account{
    String name;
    int aadhar_no;
    Person(){};
    Person(String n,int a,int ac,int b){
        name=n;
        aadhar_no=a;
        acc_no=ac;
        balance=b;
    }
    void disp(){
        System.out.println("The account name is: " + name);
        System.out.println("The aadhar no is: " + aadhar_no);
        System.out.println("The account no is: " + acc_no);
        System.out.println("The account balance is: " + balance);
    }
    
}
public class prog2 {
    public static void main(String[] args) {
        Person p1 = new Person("Harry",192844,1001,1000);
        Person p2 = new Person("Styles",193444,1002,1500);
        p1.disp();
        p2.disp();
    }
}
