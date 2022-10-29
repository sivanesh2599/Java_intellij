package Mypackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class check_condition {
    public static void main(String[] args) throws IOException {
        int a,b;
        System.out.println("Enter two number");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        a=Integer.parseInt(br.readLine());
        b=Integer.parseInt(br.readLine());
        if(a>b){
            System.out.println(a-b);
        }
        else if(a<b){
            System.out.println(a*b);
        }
        else if(a==b){
            System.out.println("Both are equal");
        }
        else {
            System.out.println("error");
        }
    }
}
