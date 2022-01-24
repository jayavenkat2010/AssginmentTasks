package task.assign;

import java.util.Arrays;
import java.util.Scanner;

public class Assigment4 { public void removeDeuplicatesFromArr(){

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
    /*
    This method moves all the zeros to the end in a given array
     */
    public void moveZeroFromArray(){
        int inputArr[] = {1,2,3,0,0,2,3,0,5,0,4,0,9};
        int arrSize = inputArr.length;
        int count = 0;
        for (int itr = 0; itr< arrSize ;itr++){
            if(inputArr[itr]!=0){
                //System.out.println()
                inputArr[count++] = inputArr[itr];

            }

        }
        while (count < arrSize){
            inputArr[count++] =0;
        }

        System.out.println("Input arr after replacement");
        for(int j=0;j<inputArr.length;j++){
            System.out.println(inputArr[j]);
        }

    }

    /*
    This method removes all the duplicate items in a Array and replaces it with 0
     */
    public void replaceDuplicate(){
        int inputArr [] =  {2,3,4,2,5,6,4,5,6,7};
        int count = 0;
        int arrSize = inputArr.length;
        for(int i = 0;i<arrSize;i++){
            for (int j=0;j<arrSize ;j++){
                if(inputArr[i]==inputArr[j]){
                    count ++;
                }else
                    continue ;
            }
        }
        System.out.println("Count ::"+count);
    }

    public void findDifference(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int arrSize = 0;
        arrSize =  sc.nextInt();
        int a[] = new int[arrSize];
        System.out.println("Enter Array Elements");
        for(int i = 0 ;i < arrSize; i++){
            a[i] = sc.nextInt();
        }
        int largestNo= a[0];
        int smallestNo = a[0];
        for(int i = 0 ;i < a.length; i++){
            if(smallestNo > a[i])
                smallestNo = a[i];
            if(largestNo < a[i])
                largestNo = a[i];
        }
        int diff = largestNo - smallestNo;
        System.out.println("Smallest "+smallestNo+" Largest "+largestNo);
        System.out.println("The Difference is "+diff);;
    }

    public void removeDuplicateElements(){
       int arraySize = 0;
       Scanner sc = new Scanner(System.in);
       int arrInput[]= {1,2,5,3,2,3,4,5,8,7,8};
       Arrays.sort(arrInput);
        int[] temp = new int[arrInput.length];
        int j = 0;

        for (int i = 0; i < arrInput.length-1; i++) {
            if (arrInput[i] != arrInput[i + 1]) {
                temp[j++] = arrInput[i];
            }
        }

        temp[j++] = arrInput[arrInput.length - 1];


        for (int i = 0; i < j; i++) {
            arrInput[i] = temp[i];
        }
        System.out.println("new size of array after removing duplicates ::"+temp.length);
        for(int k =0; k<temp.length;k++){
            System.out.println(temp[k]);
        }

    }
public static void main(String args[]){
        Assigment4 assign4 = new Assigment4();
    //    assign4.addMatrix();
      //  assign4.findSecondLargestNo();
        //assign4.findSecondSmallestNo();
        //assign4.moveZeroFromArray();
    //assign4.removeDeuplicatesFromArr();
    //assign4.replaceDuplicate();
    //assign4.findDifference();
    assign4.removeDuplicateElements();
    

}


}
