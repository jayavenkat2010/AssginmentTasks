package task.assign;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Assignment5 {

    public void findlargestWord() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");        ;
        String str = sc.nextLine();
        String word = "", small = "", large = "";
        String[] words = new String[100];
        int length = 0;
        str = str + " ";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                word = word + str.charAt(i);
            } else {
                words[length] = word;
                length++;
                word = "";
            }
        }
        small = large = words[0];
        for (int k = 0; k < length; k++) {
            if (small.length() > words[k].length())
                small = words[k];
            if (large.length() < words[k].length())
                large = words[k];
        }
        System.out.println("Smallest word: " + small);
        System.out.println("Largest word: " + large);
    }


    public void removeAllSpaces(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");        ;
        String str = sc.nextLine();
        str = str.replaceAll(" ","");
        System.out.println("resultant String is "+ str);

    }


    /*
    This method finds the sum of all elements in an array except the highest and lowest value
     */
    public void findSumOFArray(){
        int arrInput[] = {4,1,3,8,5,2};;
        int sum = 0;
        Arrays.sort(arrInput);
        for (int i =1 ;i< arrInput.length-1;i++){
            sum = sum+ arrInput[i];
        }
        System.out.println("Total count ::"+sum);
    }

    /*
    this method finds if a given string is Isogram
     */
    public boolean findIfIsogram(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");        ;
        String str = sc.nextLine();

        if(str!=null){
            str = str.replaceAll(" ","");
            str = str.toLowerCase();
            char charArr[] = str.toCharArray();
            Arrays.sort(charArr);
            for ( int i=0;i< str.length()-1;i++){
                if (charArr[i] == charArr[i + 1])
                    return false;
            }
                      return true;
        }else{
            System.out.println("Null String Entered");
        }
        return false;
    }
    public void reverseString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        ;
        String str = sc.nextLine();

        // convert String to character array
        // by using toCharArray
        char[] reverseArr = str.toCharArray();
        String reverseStr = "";


        for (int i = reverseArr.length - 1; i >= 0; i--) {
            System.out.print(reverseArr[i]);
        reverseStr = reverseStr.concat(String.valueOf(reverseArr[i]));
    }
    System.out.println("reversed String :"+reverseStr);
}

/*This method removes the odd number from a given array of even numbers or even number from the given number of odd number

 */
public void removeOddOrEven(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array");
    int arrSize = sc.nextInt();
    System.out.println("Enter array elements");
    int arrElements[] = new int[arrSize];
    int newArr [] =new int[arrSize-1];
    for(int i=0;i<arrSize;i++){
        arrElements[i] = sc.nextInt();
    }
   System.out.println("Array Elements Entered");
    int oddCount =0;
    int evenCount = 0;
    for(int j=0;j<arrSize;j++){
        if(arrElements[j]%2==0){
            evenCount++;
        }else{
            oddCount++;
        }
    }
//Removing even
if(evenCount!=0 && evenCount==1){
    System.out.println("Removing the even number");

    for(int k=0;k<arrSize;k++){
        if(arrElements[k]%2!=0){
            newArr[k] = arrElements[k];
        }else{
            System.out.println("Exluding the even number");
        }
    }
}
//Removing odd
    if(oddCount!=0 && oddCount==1){
        System.out.println("Removing the odd number");

        for(int k=1;k<=arrElements.length;k++){
            if(arrElements[k]%2!=0){
                System.out.println(k);
                System.out.println("Exluding the odd number");
            }else{
                System.out.println("here" +k);
                newArr[k] = arrElements[k];

            }
        }
    }

    //Printing final array
    for (int z=0;z< newArr.length;z++){
        System.out.println(newArr[z]);;
    }
}
    public static void main(String args[]) {
        Assignment5 assign5 = new Assignment5();
        //assign5.findlargestWord();
      //  assign5.removeAllSpaces();;
       // boolean result = assign5.findIfIsogram();
      //  System.out.println("Is Isogram "+result);
      //  assign5.findSumOFArray();
       // assign5.reverseString();//
        assign5.removeOddOrEven();

    }
}
