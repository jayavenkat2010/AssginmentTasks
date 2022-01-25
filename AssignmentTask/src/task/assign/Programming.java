package task.assign;

public class Programming {
    public Programming(){
         System.out.println("I love Programming Language");
    }
    public Programming(String name){
        System.out.println("I love "+name);
    }
    public static void main(String args[]){

        Programming pro1 = new Programming();
        Programming pro = new Programming("Java");

    }
}
