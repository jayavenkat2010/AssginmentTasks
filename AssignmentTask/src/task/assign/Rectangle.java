package task.assign;

import java.util.Scanner;

public class Rectangle {
    public static void computeArea(){
      int length = 0, breadth =0, area=0;
      area = length* breadth;
      System.out.println("Computing area without length and breadth:: "+ area);

    }
    public static void computeArea(int length, int breadth){
        int area = 0;
        area = length* breadth;
        System.out.println("Computing area with length and breadth :: "+ area);

    }
    public static void computeArea(int length){
        int area = 0;
        area = length* length;
        System.out.println("Computing area with only Length :: "+ area);

    }
    public static void main(String args[]){
       int length = 2;
       int breadth = 4;
       computeArea();
       computeArea(length);
       computeArea(length,breadth);

    }
}
