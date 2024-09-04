// WAP to declare and initialize a jagged array with even nos., where 1st row contains
// 3 elements, 2nd 2 elements, 3rd 1 element, 4th 2 elements and 5th 3 elements.
// Print the array.
package lab7_9March;

public class prog2 {
    public static void main(String[] args) {
        int arr[][]=new int[5][];
        arr[0]=new int[3];
        arr[1]=new int[2];
        arr[2]=new int[1];
        arr[3]=new int[2];
        arr[4]=new int[3]; 
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=count;
                count=count+2;
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
               System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }


    }
}
