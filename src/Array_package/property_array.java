package Array_package;

import java.sql.SQLOutput;

public class property_array {
    public static void main(String[] args) {
        int[] i={3,4,5,2,3};
        int prod=1;
        for(int j=0; j<i.length; j++){
            prod=prod*i[j];
        }
        System.out.println(prod);
    }
}
