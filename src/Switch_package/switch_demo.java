package Switch_package;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class switch_demo {
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
                if(y>z){
                    System.out.println(y+z);
                }
                break;
            case 2:
                if(y<z)
                    System.out.println(y*z);
                break;
            case 3:
                if(y==z)
                    System.out.println(y-z);
                break;
            case 4:
                if(y % 2 == 0)
                    System.out.println(y + " is even");
                else
                    System.out.println(y + "is odd");
                break;
            default:System.out.println("you have entered a wrong number");
        }
    }
}

