package Mypackage;

public class string {
    public static void main(String[] args) {
        String str ="Thiruvananthapuram";
        String str1 ="thiruvananthapuram";

        //To find the length of the string
        System.out.println(str.length());

        //To print in upper case
        System.out.println(str.toUpperCase());

        //To replace a single character
        System.out.println(str.replace('n', 'z'));
        //To print using substring
        System.out.println(str.substring(1));
        //To print using character
        System.out.println(str.charAt(4));
        //To check the two string is equal or not
        System.out.println(str.equals(str=str1));
    }
}
