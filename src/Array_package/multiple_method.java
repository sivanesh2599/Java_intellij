package Array_package;

public class multiple_method {
    //insteed of give the same conditon again and again we will use another method called lap
    public static void lap(int x, int y) {   //void is not a returning type
        if (x > y) {
            System.out.println(x * y);
        } else {
            System.out.println(x + y);
        }
    }
    public static void main(String[] args) {
        //initialize the value of x and y to lap method
        lap(5,6); lap(6,8);
    }
}


