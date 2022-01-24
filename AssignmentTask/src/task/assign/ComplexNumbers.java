package task.assign;

import java.util.Scanner;

/*
This class accepts two complex numbers as input and computes the sum , difference and product of those numbers
 */
public class ComplexNumbers {
    public int getSum(int num1, int num2) {
        int sum = 0;
        if (num1 == 0 && num2 == 0)
            return sum;
        if (num1 == 0 && num2 != 0)
            return num2;
        if (num1 != 0 && num2 == 0)
            return num1;
        if (num1 != 0 && num2 != 0) {
            sum = num1 + num2;
            return sum;
        }
        System.out.println("Sum is ::" + sum);
        return sum;
    }

    public int getDiff(int num1, int num2) {
        int diff = 0;
        if (num1 == 0 && num2 == 0)
            return diff;
        if (num1 != 0 && num2 != 0) {
            diff = num1 - num2;
            return diff;
        }
        System.out.println("Difference ::" + diff);
        return diff;
    }

    public int getProduct(int num1, int num2) {
        int product = 0;
        if (num1 == 0 || num2 == 0)
            return product;
        if (num1 != 0 && num2 != 0) {
            product = num1 * num2;
            return product;
        }
        System.out.println("Product ::" + product);
        return product;
    }

    public static void main(String args[]) {
        ComplexNumbers num = new ComplexNumbers();
        Scanner sc = new Scanner(System.in);
        int num1 = 0, num2 = 0;
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        int sum = num.getSum(num1, num2);
        System.out.println(" SUM ::" + sum);
        int diff = num.getDiff(num1, num2);
        System.out.println(" DIFF ::" + diff);
        int product = num.getProduct(num1, num2);
        System.out.println(" PRODUCT ::" + product);
    }
}
