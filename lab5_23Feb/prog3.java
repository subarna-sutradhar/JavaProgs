// 3. WAP to Create a class Employee with data members empid, name and salary.
// Use inp() to take the input of the employee and use disp() to print the employee
// details. Create 3 objects of employees and display their details.
package lab5_23Feb;
class Employee{
    int empid;
    String name;
    int salary;
    void inp(int eid,String nm,int sal){
        empid=eid;
        name=nm;
        salary=sal;
    }
    void disp(){System.out.println(empid + " " + name + " " + salary);}
}
public class prog3 {
    public static void main(String[] args) {
        Employee e1=new Employee();
        Employee e2=new Employee();
        Employee e3=new Employee();

        e1.inp(101, "Mohit", 1000);
        e2.inp(102, "Aman", 1500);
        e3.inp(103, "Sarkar", 50);

        e1.disp();
        e2.disp();
        e3.disp();
    }
}
