package task.assign;
import java.util.Scanner;
public class Assignment2 {

    /*
    Method to swap the values of two variables

     */
    public void swapValues(){
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int j = 0;
        System.out.println("Enter the value of I :");

        i = sc.nextInt();
        System.out.println("Enter the value of J :");
        j = sc.nextInt();
        i = i+ j;

       j = i-j;
       i = i-j;
        System.out.println("Values swapped");
        System.out.println(" Value of I ::"+ i);
        System.out.println(" Value of J ::"+ j);

    }
/*
Print the input recieved from the user
 */
    public void printValue(){
        System.out.println("Enter a value");;
        Scanner sc = new Scanner(System.in);
         String str = "";
         str = sc.nextLine();
         if(!str.isEmpty()){
             System.out.println("Input is :" +str);

         }else{
             System.out.println("Invalid Input :" );
         }
    }

    public void addValues(){
        int a , b ,z ,result =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two values from 1 to 10");
        System.out.println("Enter value 1 :");
        a = sc.nextInt();
        System.out.println("Enter value 2 :");
        b= sc.nextInt();
        z = a+b;
        result = z+30;
        System.out.println("Result :"+ result);
    }
    /*
    this java program checks if a given number is divisible by 3 or 5

     */

    public void checkIfDivisible(){
     int i = 0;
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a value");
     i = sc.nextInt();
     if(i>0){
         if(i%3==0 && i%5==0){
             System.out.println("Cosult ADD java training");
         }else if(i%3==0 && i%5>0){
             System.out.println("ConsultADD");
         }else if (i%3>0 && i%5==0){
             System.out.println("JAva training");

         }else{
             System.out.println("invalid value");
         }
     }else{
         System.out.println("invalid value");
     }
    }
    public static void main(String args[]){
        Assignment2 assign2 = new Assignment2();
        //assign2.printValue();
        //assign2.addValues();
          assign2.checkIfDivisible();

    }
}
