package Array_package;

public class method_overloading {
    public static void lap1(){
        System.out.println("sivanesh");
    }
    public static void lap1(int x, int y){
        System.out.println("siva "+x*y);
    }
    public static void lap1(String str){
        System.out.println(str.length());
    }

    public static void main(String[] args) {
        method_overloading mo=new method_overloading();
        mo.lap1();
        mo.lap1(5,6);
        mo.lap1("sivanesh");


    }
}
