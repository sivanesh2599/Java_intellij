package Switch_package;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class switch_arithmetic {
    public static void main(String[] args) throws IOException {
        //creating a variable
        int x,y,z;
        System.out.println("Enter two numbers");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        x=Integer.parseInt(br.readLine());
        y=Integer.parseInt(br.readLine());
        z=Integer.parseInt(br.readLine());
        switch(x){
            case 1:
                //operation for addition
                System.out.println(y+z);
                break;
            case 2:
                //operation for multiplication
                System.out.println(y*z);
                break;
            case 3:
                //operation for subraction
                System.out.println(y-z);
                break;
            default:System.out.println("you have entered a wrong number");
        }
    }
    }

