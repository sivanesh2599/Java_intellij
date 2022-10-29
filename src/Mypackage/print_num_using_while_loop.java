package Mypackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class print_num_using_while_loop {
    public static void main(String[] args) throws IOException {

        int i;
//        System.out.println("Enter the limit");
//        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//        num=Integer.parseInt(br.readLine());
        i=1;
        while(i<=10){;
        if(i%2==0)
            System.out.println(i);
            i=i+1;
        }
    }
}
