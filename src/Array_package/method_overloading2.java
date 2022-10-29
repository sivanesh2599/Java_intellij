package Array_package;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class method_overloading2 {
    public static void add(int b, int c) {
        System.out.println("addition of b and c is " + (b + c));
    }

    public static void mul(int b, int c) {

        System.out.println("multiplication of b and c is " + (b * c));
    }

    public static void div(int b, int c) {

        System.out.println("division of b and c is " + (b / c));
    }

    public static void sub(int b, int c) {

        System.out.println("subraction of b and c is " + (b - c));
    }

    public static void odd_even(int a) {
        if (a % 2 == 0)
            System.out.println(a + " is even");
        else
            System.out.println(a + "is odd");
    }

    public static void age(int a) {
        if (a > 18)
            System.out.println("Age is greater than 18 eligible to vote");
        else if (a <= 18)
            System.out.println("Age is lesser than 18 not eligible to vote");
        else if (a >= 18)
            System.out.println("you are adult eligible to vote");
        else
            System.out.println("you are not eligible");
    }

    public static void switch_1(int a) throws IOException {
        switch (a % 2) {
            case 1:
                System.out.println("Entered number is odd");
                break;
            case 0:
                System.out.println("Entered number is even");
                break;
        }
    }

    public static void main(String[] args) throws IOException {
        int a, b, c;
        //declare a value of a by user input
        System.out.println("Enter the value of a,b,c");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //checking the given input is integer type or not
        a = Integer.parseInt(br.readLine());
        b = Integer.parseInt(br.readLine());
        c = Integer.parseInt(br.readLine());
        //create a method overloading function
        method_overloading2 mo = new method_overloading2();
        //Printing the value
        mo.add(b, c);
        mo.mul(b, c);
        mo.div(b, c);
        mo.sub(b, c);
        mo.odd_even(a);
        mo.age(a);
        mo.switch_1(a);
    }
}