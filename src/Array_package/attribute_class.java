package Array_package;

public class attribute_class {
    int a; int b; String name; int sum;int prod;
    public void sum(){
        sum=a+b;
        System.out.println(sum);
    }
    public void  prod(){
        prod=a*b;
        System.out.println(prod);
    }
    public void str(){
        System.out.println(name.toUpperCase());
        System.out.println(name.length());
    }

    public static void main(String[] args) {
        attribute_class ac=new attribute_class();
        ac.a=3;ac.b=5;ac.name="sivanesh";
        ac.sum();
        ac.prod();
        ac.str();
    }
}
