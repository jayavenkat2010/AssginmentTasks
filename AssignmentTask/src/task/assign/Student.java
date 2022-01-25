
package task.assign;
import java.util.Scanner;
public class Student {
    public static void main(String args[]){
       // Student s = new Student();
        System.out.println("Enter Student Name");
        Scanner sc = new Scanner(System.in);
        String studentName = null;
        studentName = sc.nextLine();
        if(studentName!=null && (!studentName.isEmpty()) && studentName!=""){
            printStudentDetails(studentName);
        }else{

            printStudentDetails();
        }
    }
    public static void printStudentDetails(){
        System.out.println("StudentName::"+"\n"+" Unknown");
    }
    public static void printStudentDetails(String studentName){
        System.out.println("StudentName::"+" \n"+studentName);
    }

}
