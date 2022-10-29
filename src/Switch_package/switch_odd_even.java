package Switch_package;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class switch_odd_even {
    public static void main(String[] args) throws IOException {
        int a;
        System.out.println("enter the number to check it is odd or even");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        a=Integer.parseInt(br.readLine());
        switch (a%2){
            case 1:
                System.out.println("Entered number is odd");
                break;
            case 0:
                System.out.println("Entered number is even");
                break;
        }

    }
}
