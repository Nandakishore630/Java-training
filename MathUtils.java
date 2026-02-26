import java.util.Scanner;
public class MathUtils {
    void add(int a, int b){
        System.out.println(a+b);
    }
    static void sub(int a, int b){
        System.out.println(a-b);
    }
    static void multiply(int a, int b){
        System.out.println(a*b);
    }

}
class Basic{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MathUtils ob = new MathUtils();
        ob.add(10, 20);
        MathUtils.multiply(10, 20);
    }
}