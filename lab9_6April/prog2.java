// 2. Define an interface with three methods – earnings(), deductions() and bonus() and define a Java class „Manager‟
// which uses this interface without implementing bonus() method. Also define another Java class „Substaff‟ which

// extends from „Manager‟ class and implements bonus() method. Write the complete program to find out earnings,
// deduction and bonus of a substaff with basic salary amount entered by the user as per the following guidelines –

// earnings basic + DA (80% of basic) + HRA (15% of basic)

// deduction PF 12% of basic

// bonus 50% of basic

package lab9_6April;

interface cal{
    void earnings();
    void deductions();
    void bonus();
}
abstract class Manager implements cal{
    double basic;
    double da;
    double hra;
    Manager(){};
    public void earnings(){
        System.out.println("The earning is " + (basic+ da + hra));
    }
    public void deductions(){
        System.out.println("The deduction is " + 0.12*basic);
    }
}
class Substaff extends Manager{
    Substaff(){};
    Substaff(int a){
        basic = a;
        da = basic*0.8;
        hra = basic*0.15;
    };

    public void bonus(){
        System.out.println("The bonus is " + 0.5*basic);
    }
}
public class prog2 {
    public static void main(String[] args) {
        Substaff s;
        s = new Substaff(5000);
        s.earnings();
        s.deductions();
        s.bonus();
    }
}
