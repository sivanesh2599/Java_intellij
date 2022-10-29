package Array_package;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class user_method_overloading {
    public static void lap(int i, int j){
        System.out.println("addition of i and j is "+(i+j));
    }
    public static void lap1(int i, int j){
        System.out.println("multiplication of i and j is "+(i*j));
    }
    public static void lap2(int i, int j){
        System.out.println("subraction of i and j is "+(i-j));
    }

    public static void lap3(int i, int j) {
        System.out.println("division of i and j is "+(i/j));
    }
    public static void main(String[] args) throws IOException {
        int i,j;
        //declare a value of i and j by user input
        System.out.println("Enter two values i and j");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //checking the given input is integer type or not
        i=Integer.parseInt(br.readLine());
        j=Integer.parseInt(br.readLine());
        //create a method overloading function
        user_method_overloading mo=new user_method_overloading();
        mo.lap(i,j);
        mo.lap1(i,j);
        mo.lap2(i,j);
        mo.lap3(i,j);

    }
}
