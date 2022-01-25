package task.assign;
import java.util.Arrays;


public class Employee {

    public static void main(String args[]){
        Employee emp = new Employee();
        String [][]empDetails = {{"Robert","1994","64C- Walls Street"},{"Sam","2000","68D- Walls Streat"},{"John","1998","26B- Walls Streat"}};
        System.out.println("Name :: "+ "Year ::" + "Address :");
        for(int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(empDetails[i][j]+ " \t");
            }
            System.out.println();
        }

    }
}
