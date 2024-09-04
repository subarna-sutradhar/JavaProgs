// 1.WAP in java to create a class Animal having following features: name, type and
// two member functions in() to input the details and out() for printing the details.
// Create three objects having name lion, dog and cow and their respective eating
// type as carnivore, omnivore and herbivore and print the details.

package lab5_23Feb;

/**
 * prog1
 */
class Animal{
    String name;
    String type;
    void in(String nm,String ty){
        name=nm;
        type=ty;
        
    }
    void out(){
        System.out.println(name +" "+ type);
    }
}
public class prog1 {
    public static void main(String[] args){
        Animal a1 =new Animal();
        Animal a2 =new Animal();
        Animal a3 =new Animal();
        a1.in("Lion","Carnivore");
        a2.in("Dog","omnivore");
        a3.in("Cow","herbivore");
        a1.out();
        a2.out();
        a3.out();
    }
}