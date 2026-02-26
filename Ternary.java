import java.util.Scanner;
public class Ternary {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        char result = ((90>=num && num<=99)?'A':(80>=num && num<=89)?'B':(70>=num && num<=79)?'C':(60>=num && num<=69)?'D':'F');
        System.out.println(result);
        }
    }
    