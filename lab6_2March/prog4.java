// Initialize an integer array in java and print only those elements which are greater than 10(
package lab6_2March;

public class prog4 {
    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[0]=10;
        arr[1]=2;
        arr[2]=25;
        arr[3]=1;
        arr[4]=89;

        for(int i:arr){
            if (i>10) {
                System.out.println(i);
            }
        }
    }
}
