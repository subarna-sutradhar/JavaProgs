// Program to print these grade for given mark using i else
// >90 ------------- O

// 81-90 --------------- E

// 71-80 -----------------A

// 61-70 ------------------ B

// 51 – 60 ---------------- C

// 40 – 50 --------------- Pass

// <40 ---------------------- Fail
package lab5_23Feb;

public class prog2 {

    public static void main(String[] args) {
        int marks=89;
        if(marks>90 && marks<=100){
            System.out.println("Grade: O");
        }
        else if(marks>=81 && marks<=90){
            System.out.println("Grade: E");

        }
        else if(marks>=71 && marks<=80){
            System.out.println("Grade: A");

        }
        else if(marks>=61 && marks<=70){
            System.out.println("Grade: B");

        }
        else if(marks>=51 && marks<=60){
            System.out.println("Grade: C");

        }
        else if(marks>=40 && marks<=50){
            System.out.println("Grade: Pass");
            
        }
        else{
            System.out.println("Grade: Fail");

        }
    }
}
