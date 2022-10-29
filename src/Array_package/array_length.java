package Array_package;

public class array_length {
    public static void main(String[] args) {
        String[] str= new String[5];
        str[0]="siva";
        str[1]="kumar";
        str[2]="srinath";
        str[3]="kiran";
        str[4]="ari";
        System.out.println(str.length);
        for(int i=0;i<=str.length-1;i++){
            System.out.println(str[i]);
        }
    }
}
