import java.util.concurrent.locks.Condition;

public class Cons {
    Cons(){
        
    }
    Cons(double amount){
        System.out.println(amount);
        System.out.println("Hello JARVIS");
    }
    Cons(int amount, int gst){
        System.out.println(amount+gst);
    }
    Cons(String amount, int gst){
        System.out.println(amount+gst);
    }
    public static void main(String[] args) {
        Cons ob = new Cons(100);
        Cons ob1 = new Cons(100);
        Cons ob2 = new Cons("100", 10);
    }

}
