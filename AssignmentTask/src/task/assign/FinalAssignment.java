/*
This class has methods for all the programming questions given in task7
 */
package task.assign;

import java.util.Scanner;

public class FinalAssignment {
    //Method to reverse a string
    public void reverseString(String str){
        String revStr = "";
     /*   for(int i=5;i>0;i--){
            System.out.println(i);
        }*/
        System.out.println(str.length());
       if(str!="" && str!=null && (!str.isEmpty())){
            for(int i=str.length()-1;i>=0;i--){
                System.out.println(i);

                System.out.println(str.charAt(i));
              revStr =  revStr.concat(String.valueOf(str.charAt(i)));
            }
            System.out.println("Reversed String"+ revStr);
        }else{
            System.out.println("Empty String ::");
        }
    }

    /*
    This method finds intersection of two arrays
     */
 public void findIntersection(){
     int arr1[] = {21, 22, 45, 18, 12};
     int arr2[] = {78, 45, 22, 73, 45};
     System.out.println("Intersection of the two arrays ::");

     for(int i = 0; i<arr1.length; i++ ) {
         for(int j = 0; j<arr2.length; j++) {
             if(arr1[i]==arr2[j]) {
                 System.out.println(arr1[j]);
             }
         }
     }
 }
 public void checkIfUnique(String str){
     int occurance = 0;
     if(str!=null && (!str.isEmpty())&& str!=""){
      for(int i=0;i<str.length();i++){
          occurance =0;

          for(int j=0;j<str.length();j++){
            if(String.valueOf(str.charAt(j)).equalsIgnoreCase(String.valueOf(str.charAt(i)))){
                occurance++;
            }
          }
          if(occurance>1){
              System.out.println("Is Not Unique :");
              break;
          }else{
              continue;
          }
      }

     }
 }
    public static void main(String args[]){
        FinalAssignment assign = new FinalAssignment();

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //assign.reverseString(str);
       // assign.findIntersection();
        assign.checkIfUnique(str);

    }
}
