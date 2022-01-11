package task.assign;
import java.util.Scanner;
public class Assignment2 {
    public void swapValues(){
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int j = 0;
        System.out.println("Enter the value of I :");

        i = sc.nextInt();
        System.out.println("Enter the value of J :");
        j = sc.nextInt();
      //  i = i+ j;
        System.out.println(i = i+ j);
        System.out.println( j = i-j);
        System.out.println(i = i-j);
       // j = i-j;
       // i = i-j;
        System.out.println("Values swapped");
        System.out.println(" Value of I ::"+ i);
        System.out.println(" Value of J ::"+ j);

    }
    public static void main(String args[]){
        Assignment2 assign2 = new Assignment2();

        
    }
}
