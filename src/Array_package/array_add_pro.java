package Array_package;

import java.sql.SQLOutput;

public class array_add_pro{
    public static int sum(int ...numbers) {    // varchar   int[] numbers={1,2,3,4,5}
        int sum = 0;
        for (int j = 0; j < numbers.length; j++) {
            sum = sum + numbers[j];
        }
        return sum;
    }
    public static int pro(int ... numbers){
        int pro =1;
        for (int j = 0;j<numbers.length; j++){
            pro = pro + numbers[j];
        }
        return pro;
    }
    public static void main(String[] args) {
        array_add_pro cw=new array_add_pro();
        System.out.println( cw.sum(1,2,3,4,5));
        System.out.println(cw.pro(1,2,3,4,5,6));
    }
}

