package Mypackage;

public class vote_age {
    public static void main(String[] args) {
        //Declare a variable age
        int age=18;
        //Checking the age
        if(age>18)
            System.out.print("Age is greater than 18 eligible to vote");
        else if(age<=18)
            System.out.println("Age is lesser than 18 not eligible to vote");
        else if(age>=18)
            System.out.println("you are adult eligible to vote");
        else
            System.out.println("you are not eligible");
    }
}
