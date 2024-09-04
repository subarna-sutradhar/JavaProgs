package lab7_9March;

// public class test {
//     int rollno;

//     String name;

//     static String college = "KIIT";

//     static void change(){

//     college = "KISS";

//     }

//     test(int r, String n){

//     rollno = r;

//     name = n;

//     }
//     void display (){
//         System.out.println(rollno+" "+name+" "+college);
//     }
//     public static void main(String args[]){

//         test.change();

//         test s1 = new test(111,"Karan");

//         test s2 = new test(222,"Aryan");

//         test s3 = new test(333,"Laxman");

//         s1.display();

//         s2.display();

//         s3.display();

//     }
// }
// public class A3{

//     static{

//     System.out.println("static block is invoked");

//     System.exit(0);

//     }

//     }
class Animal { }

class Dog extends Animal

{

static void method(Animal a) {

if(a instanceof Dog){

Dog d=(Dog)a;//downcasting

System.out.println("ok downcasting performed");

}

}

public static void main (String [] args) {

Animal a=new Dog();

Dog.method(a); } }
// class Shape {

//     void draw() {
//         System.out.println("drawing...");
//     }

// }

// class Rectangle extends Shape {

//     void draw() {
//         System.out.println("drawing rectangle...");
//     }

// }

// class Circle extends Shape {

//     void draw() {
//         System.out.println("drawing circle...");
//     }

// }

// class Triangle extends Shape {

//     void draw() {
//         System.out.println("drawing triangle...");
//     }

// }

// class Bike

// {

//     public static void main(String args[])

//     {

//         Shape s;

//         s = new Rectangle();

//         s.draw();

//         s = new Circle();

//         s.draw();

//         s = new Triangle();

//         s.draw();

//     }

// }