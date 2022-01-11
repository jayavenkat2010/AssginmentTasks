package task.assign;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
This class contains all the assigments for java training
09/01/2022

 */
public class Assignment1 {

    /*
    This method takes an Integer Value as an Input and prints the multiplication table for the given integer
     */
    public void printTables() {
        try {
            System.out.println("Enter the Number for Printing Table");
            Scanner sc = new Scanner(System.in);

            int num = sc.nextInt();
            if (num > 0) {
                for (int i = 1; i <= 10; i++) {
                    System.out.println(num + "*" + i + " = " + num * i);
                }
            } else {
                System.out.println("Invalid Value");
            }
        } catch (InputMismatchException e) {
            //  e.printStackTrace();
            System.out.println("Only Integer Inputs allowed");
        }

    }

    /*
    This method takes 10 integer values as Input from the user and prints the total of all the values
    also it computes the average of the values
     */
    public void ComputeTotalAndAverage() {
        try {
            int total = 0;
            for (int itr = 1; itr <= 10; itr++) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter Values : " + itr);

                int inputVal = sc.nextInt();
                total = total + inputVal;
            }
            System.out.println("Total Value " + total);
            System.out.println("Average of ten values " + total / 10);
        } catch (InputMismatchException e) {

        }
    }

    /*
    This method takes a month Number as Input and displays the number of Days in the Month

     */

    public void ComputeNoOfDays() {
        System.out.println("Enter a Month Number from 1 to 12 ..");
        Scanner sc = new Scanner(System.in);

        int noOfDays = 0;
        int monthNo = 0;
        String monthName = null;
        int yearNo = 0;
        monthNo = sc.nextInt();
        if (monthNo > 0 && monthNo == 2) {
            System.out.println("Enter the Year to determine No of Days of February");
            yearNo = sc.nextInt();
        }


        if (monthNo > 0 && monthNo <= 12) {
            switch (monthNo) {
                case 1:
                    monthName = "January";
                    noOfDays = 31;
                    break;
                case 2:
                    monthName = "February";
                    if ((yearNo % 400 == 0) || ((yearNo % 4 == 0) && (yearNo % 100 != 0))) {
                        noOfDays = 29;
                    } else {
                        noOfDays = 28;
                    }
                    break;
                case 3:
                    monthName = "March";
                    noOfDays = 31;
                    break;
                case 4:
                    monthName = "April";
                    noOfDays = 30;
                    break;
                case 5:
                    monthName = "May";
                    noOfDays = 31;
                    break;
                case 6:
                    monthName = "June";
                    noOfDays = 30;
                    break;
                case 7:
                    monthName = "July";
                    noOfDays = 31;
                    break;
                case 8:
                    monthName = "August";
                    noOfDays = 31;
                    break;
                case 9:
                    monthName = "September";
                    noOfDays = 30;
                    break;
                case 10:
                    monthName = "October";
                    noOfDays = 31;
                    break;
                case 11:
                    monthName = "November";
                    noOfDays = 30;
                    break;
                case 12:
                    monthName = "December";
                    noOfDays = 31;


            }
            System.out.println("Month Name :" + monthName + " No Of Days :" + noOfDays);
        } else {
            System.out.println("Invalid Month No");
        }
    }

    /*
    This method takes integer N as Input from user and print all those Numbers and the total values of all those natural numbers

     */
    public void addNaturalNumbers() {
        try {
            System.out.println("Enter any Natural No");
            Scanner sc = new Scanner(System.in);
            int natNo = 0;
            int totalVal = 0;
            natNo = sc.nextInt();
            if (natNo > 0) {
                for (int itr = 1; itr <= natNo; itr++) {
                    totalVal = totalVal + itr;
                    System.out.println(itr);
                }
                System.out.println("total Value :" + totalVal);
            } else {
                System.out.println("Nothing to Print ");
            }

        } catch (InputMismatchException e) {
            System.out.println("Enter only Integer");
        }
    }

    /*
    This method finds number of digits in a long variable

     */
    public void findNoOfDigits() {
        try {
            //int num = 0;
            System.out.println("Enter a Long Value");
            Scanner sc = new Scanner(System.in);
            long inputNum = 0;
            long digits = 0;
            inputNum = sc.nextLong();
            long total = 0;

            while (inputNum > 0) {
                total = total + inputNum % 10;
                inputNum = inputNum / 10;
                digits++;
            }
            System.out.println("Total No of Digits : " + digits);
            System.out.println(" Total Value : " + total);
        } catch (InputMismatchException e) {
            System.out.println("Invalid Value");
        }
    }
    /*
    This method takes a year as Input and finds if it is a leap year or not
     */
    public void findLeapYear(){
        try{
            System.out.println("Enter a Year :");
            Scanner sc = new Scanner(System.in);
            int year = 0 ;
            year = sc.nextInt();
            if(year>0){
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))){
                    System.out.println(year + " is a leap year ");
                }else{
                    System.out.println(year + " is not a leap year");
                }
            }else{
                System.out.println("Enter a valid year");
            }
        }catch(InputMismatchException e){
    System.out.println("Enter only Numeric Input");
        }
    }
/*
This method takes three integer variables as Input and prints if the numbers are in increasing or decreasing order

 */
    public void isIncreasingOrDecreasing(){
        try{
            int i ,j, k =0;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter 3 Input Numbers");
            System.out.println("Enter Input 1");
            i = sc.nextInt();
            System.out.println("Enter Input 2");
            j = sc.nextInt();
            System.out.println("Enter Input 3");
            k = sc.nextInt();
            if (j<i && k<j){
                System.out.println("In Descending Order ");
            }else if (j>i && k> j){
                System.out.println("In Ascending Order");
            }else{
                System.out.println("Not in Ascending or Descending order");
            }
        }catch(InputMismatchException e){
            System.out.println("Enter only Integers");
        }
    }

    /*
    This method prints number in right angle shape

     */
    public void printNoInFormat(){
        int i,j,n = 0;
        System.out.print("Input number of rows to print : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
                System.out.print(j);

            System.out.println("");
        }

    }
    public void compareFloatValues(){
        try{
            Float f1 ,f2;
            System.out.println("Enter two float values ");

            Scanner sc = new Scanner (System.in);
            f1= sc.nextFloat();
            f2 = sc.nextFloat();
            if(f1 >0 && f2>0){
             if(Float.compare(f1,f2)==0) {
                 System.out.println("Both values are equal");

             }  if(Float.compare(f1,f2)<0){
                 System.out.println("Both values are not Equal");

             }
            }
        }catch(InputMismatchException e){
            System.out.println("Invalid INnput");
        }
    }
 public void removeDeuplicatesFromArr(){

        int  arr[] = {1,2,1,1,4,5};
        Arrays.sort(arr);
        int n = arr.length;

     int[] temp = new int[n];
     System.out.println("temp size ::"+ temp.length);
     int j = 0;
     for (int i=0; i<n-1; i++){
         System.out.println("inside "+i);
         if (arr[i] != arr[i+1]){
             System.out.println("Adding Values ::"+ arr[i]);
             temp[j++] = arr[i];
         }
     }
     temp[j++] = arr[n-1];
     System.out.println("Temp size now is "+temp.length);

     for (int arrItr=0; arrItr<=j; arrItr++){
         arr[arrItr] = temp[arrItr];
     }
     System.out.println("New Size ::"+ arr.length);
   for(int k =0;k<temp.length;k++){
       System.out.println(temp[k]);
   }
    }

    public void findSecondLargestNo(){
        int temp;
        int a[] = {22,45,67,89,24};
        for (int i = 0; i < a.length; i++)
        {
            for (int j = i + 1; j < a.length; j++)
            {
                if (a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
           System.out.println("Second Largest :"+ a[a.length-2]);
    }

    public void findSecondSmallestNo(){
        int temp;
        int a[] = {22,45,67,89,24};
        for (int i = 0; i < a.length; i++)
        {
            for (int j = i + 1; j < a.length; j++)
            {
                if (a[i] < a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Second Smallests :"+ a[a.length-2]);
    }
public void addMatrix(){

        int a[] []= {{1,2,3},
                    {2,3,4},
                    {5,6,7}};
        int b[][]={{1,2,3},
                {2,3,4},
                {5,6,7}};

              int i, j;
        int c[][] = new int[a.length][a.length];

        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a.length; j++)
                c[i][j] = a[i][j] + b[i][j];

    }
        for (int k =0 ;k< c.length; k++){
            for(int itr =0;itr<c.length;itr++){
                System.out.println("new Matrix ::"+c[k][itr]);
            }
        }
}
    public static void main(String args[]) {
        Assignment1 assgn = new Assignment1();
        // assgn.printTables();
        // assgn.ComputeTotalAndAverage();
        // assgn.ComputeNoOfDays();
        // assgn.addNaturalNumbers();
        //assgn.findNoOfDigits();
        //assgn.findNoOfDigits();
        //assgn.findLeapYear();;
        //assgn.isIncreasingOrDecreasing();
        //assgn.printNoInFormat();
      //   assgn.compareFloatValues();
      //  assgn.removeDeuplicatesFromArr();
        //assgn.findSecondLargestNo();
        //assgn.findSecondSmallestNo();
        assgn.addMatrix();

    }
}
