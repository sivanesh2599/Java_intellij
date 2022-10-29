package Switch_package;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class switch_days {
    public static void main(String[] args) throws IOException {
        int day;
        System.out.println("Enter two numbers");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        day=Integer.parseInt(br.readLine());
        switch (day){
            case 1:
                System.out.println("sunday");
                break;
            case 2:
                System.out.println("monday");
                break;
            case 3:
                System.out.println("tuesday");
                break;
            case 4:
                System.out.println("wednesday");
                break;
            case 5:
                System.out.println("thursday");
                break;
            case 6:
                System.out.println("friday");
                break;
            case 7:
                System.out.println("saturday");
                break;
            default:
                System.out.println("the entered case is not stored inside the switch");
        }

    }
}
