/*Programs for tasks given in Task1*/

package task.assign;


import java.util.Scanner;

public class Assignment2 {

    /*
    Method to swap the values of two variables

     */
    public void swapValues() {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int j = 0;
        System.out.println("Enter the value of I :");

        i = sc.nextInt();
        System.out.println("Enter the value of J :");
        j = sc.nextInt();
        i = i + j;

        j = i - j;
        i = i - j;
        System.out.println("Values swapped");
        System.out.println(" Value of I ::" + i);
        System.out.println(" Value of J ::" + j);

    }

    /*
    Print the input recieved from the user
     */
    public void printValue() {
        System.out.println("Enter a value");
        ;
        Scanner sc = new Scanner(System.in);
        String str = "";
        str = sc.nextLine();
        if (!str.isEmpty()) {
            System.out.println("Input is :" + str);

        } else {
            System.out.println("Invalid Input :");
        }
    }

    public void addValues() {
        int a, b, z, result = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two values from 1 to 10");
        System.out.println("Enter value 1 :");
        a = sc.nextInt();
        System.out.println("Enter value 2 :");
        b = sc.nextInt();
        z = a + b;
        result = z + 30;
        System.out.println("Result :" + result);
    }
    /*
    this java program checks if a given number is divisible by 3 or 5

     */

    public void checkIfDivisible() {
        int i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value");
        i = sc.nextInt();
        if (i > 0) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Cosult ADD java training");
            } else if (i % 3 == 0 && i % 5 > 0) {
                System.out.println("ConsultADD");
            } else if (i % 3 > 0 && i % 5 == 0) {
                System.out.println("JAva training");

            } else {
                System.out.println("invalid value");
            }
        } else {
            System.out.println("invalid value");
        }
    }

    public void performMathOperations() {
        System.out.println("Choose any of the below /n " + "1 . Addition /n" + "2. Substraction /n" + "3. Division /n" + "4. Multiplication " + " 5. Average");
        int choice = 0;
        int firstValue = 0;
        int secondValue = 0;
        int thirdValue = 0;
        int fourthValue = 0;
        int result = 0;

        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();
        if (choice != 0 && choice <= 5) {
            switch (choice) {
                case 1:
                    System.out.println("You have choosen Addition" + " \n Enter Two Values");
                    firstValue = sc.nextInt();
                    secondValue = sc.nextInt();
                    result = firstValue + secondValue;
                    if (result < 0) {
                        System.out.println("Option " + choice + " is returning a negative value");
                    } else {
                        System.out.println("Result ::" + result);
                    }

                    break;
                case 2:
                    System.out.println("You have choosen Subtraction" + " \n Enter Two Values");
                    firstValue = sc.nextInt();
                    secondValue = sc.nextInt();
                    result = firstValue - secondValue;

                    if (result < 0) {
                        System.out.println("Option " + choice + " is returning a negative value");
                    } else {
                        System.out.println("Result ::" + result);
                    }
                    break;
                case 3:
                    System.out.println("You have choosen Multiplication" + " \n Enter Two Values");
                    firstValue = sc.nextInt();
                    secondValue = sc.nextInt();
                    result = firstValue * secondValue;
                    if (result < 0) {
                        System.out.println("Option " + choice + " is returning a negative value");
                    } else {
                        System.out.println("Result ::" + result);
                    }

                    break;
                case 4:
                    System.out.println("You have choosen Division" + " \n Enter Two Values");
                    firstValue = sc.nextInt();
                    secondValue = sc.nextInt();
                    result = firstValue / secondValue;
                    if (result < 0) {
                        System.out.println("Option " + choice + " is returning a negative value");
                    } else {
                        System.out.println("Result ::" + result);
                    }

                    break;
                case 5:
                    System.out.println("You have choosen Average" + " \n Enter Four Values");
                    firstValue = sc.nextInt();
                    secondValue = sc.nextInt();
                    thirdValue = sc.nextInt();
                    fourthValue = sc.nextInt();
                    result = (firstValue + secondValue + thirdValue + fourthValue) / 4;
                    if (result < 0) {
                        System.out.println("Option " + choice + " is returning a negative value");
                    } else {
                        System.out.println("Result ::" + result);
                    }

            }
        } else {
            System.out.println("Invalid choice");
        }
    }
    /*
    This method gets input value in Loop and print break if the input value is negative
     */
        public void getInputInLoop () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 Values");
        int intVal = 0;
         for(int i=0;i<5;i++){
             System.out.println(i +"::");
             intVal = sc.nextInt();
             if(intVal<0){
                 System.out.println("Its Over");
                 break;
             }else{
                 continue;
             }
         }
    }
/*
This method finds all the values that are divisible by 7 but not multiples of 5
 */
 public void findMultiplesOFSeven(){
     System.out.println("Finding all the numbers divisible by 7 but not a multiple of 5");
       int j = 0;
     for(int i =2000;i<=3000;i++){
           if(i%7==0 && i%5!=0){
               System.out.println(i);
               j++;
           }
       }
     System.out.println("Total No of Numbers Divisible by 7 but not a multiple of 5 between 2000 to 3000 is  "+j);
 }

 /*
 This method prints numbers 0 to 6 except 3 and 6
  */
public void printSelectedNo(){
     for (int i=0;i<=6;i++){
        if((i==3) || (i==6)){

         System.out.println("Skipping ::"+i);
         }else{
            System.out.println(i);
        }
     }
}
/*
This method performs the following action
If is odd, print NEW
If is even and in the inclusive range of 2 to 5, print OLD
If is even and in the inclusive range of 6 to 30, print NEW
If is even and greater than 30, print OLD

 */
    public void computeInteger(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Integer Value");
        int intVal = sc.nextInt();
        if(intVal!=0){
            if(intVal%2==1){
                //Entered Value is an Odd Number
                System.out.println("NEW");
            }else if(intVal%2==0 && (intVal>=2 && intVal<=5) ){
                //Entered value is an even number and in the range of 2 to 5
                System.out.println("OLD");
            }else if (intVal%2==0 && (intVal>=6 && intVal<=30)){
                //Entered number is an even number and in the range of 6 to 30
                System.out.println("New");
            }else if(intVal%2==0 && intVal >30){
                //Entered number is an even number and greater than 30
                System.out.println("Old");
            }
        }else{
            System.out.println("Enter a valid value");
        }

    }
/*
This program takes a character input and compares the character with "RANDOM" if the given char is
any of these it returns found
 */
    public void findChar(){
        String inputChar ;
        Scanner sc = new Scanner(System.in);
        inputChar = sc.nextLine();
        if(inputChar!=null){
            if("RANDOM".contains(inputChar) || "random".contains(inputChar)){
                System.out.println("Found");
            }else{
                System.out.println("Not Found");
            }
        }
    }

    public void computeFloat() {
        float f1 =0 ;
        Scanner sc = new Scanner(System.in);
        f1 = sc.nextFloat();
        if(f1==0){

        }
    }
    public void compareAverage() {
        int a = 20;
        int b = 20;
        int c = 10;
        int avg = (a + b + c) / 3;
        if (avg > a && avg > b && avg > c) {
            System.out.println("Avg is greated than A B and C");
        }
            else {
                if (avg > a && avg > b) {
                    System.out.println("*Avg is greater than A B and C");
                }else{
                    if(avg >a && avg >c){
                        System.out.println("*Avg is higher than A  C");
                    }else if (avg > b && avg >c){
                        System.out.println("*Avg is higher than  C");
                    }else if(avg>a ){
                        System.out.println("*Avg is higher than A ");
                    }else if (avg >b){
                        System.out.println("*Avg is higher than   B");
                    }else if (avg >c){
                        System.out.println("*Avg is higher than   C");
                    }
                }
            }


    }
    /*
    8. This method reads a floating-point number and prints "zero"
    if the number is zero.Otherwise, print "positive" or "negative".
    Add "small" if the absolute value of the number is less than 1,or "large" if it exceeds 1,000,000
     */
   public void computeFloatValues() {
       float f1 = 0;
       Scanner sc = new Scanner(System.in);
       f1 = sc.nextFloat();

       System.out.println("Input float Variable is ::" + f1);
       System.out.println("f1 absolute :" + Math.abs(f1));
       if (f1 == 0) {
           System.out.println("Zero");

       }
       if(f1<0.0){
           System.out.println("Negative and small");
       }else{
           if (Math.abs(f1) > 0.0 && Math.abs(f1 )> 1000000) {
               System.out.println("Positive And Large");
           } else if (Math.abs(f1) > 0.0 && Math.abs(f1) < 1000000) {
               System.out.println("Positive");
           }
       }


       System.out.println("Absoluete value is :" + Math.abs(f1));

   }
    public static void main(String args[]){
        Assignment2 assign2 = new Assignment2();
        //assign2.printValue();
        //assign2.addValues();
          //assign2.checkIfDivisible();
        //assign2.performMathOperations();
        //assign2.findMultiplesOFSeven();
        //assign2.printSelectedNo();
        //assign2.computeInteger();
        //assign2.findChar();
        //assign2.compareAverage();;
        assign2.computeFloatValues();


    }
}
