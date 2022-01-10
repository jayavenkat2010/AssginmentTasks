package task.assign;

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

            }
        }catch(InputMismatchException e){

        }
    }

    public static void main(String args[]) {
        Assignment1 assgn = new Assignment1();
        // assgn.printTables();
        // assgn.ComputeTotalAndAverage();
        // assgn.ComputeNoOfDays();
        // assgn.addNaturalNumbers();
        //assgn.findNoOfDigits();
        assgn.findNoOfDigits();

    }
}
