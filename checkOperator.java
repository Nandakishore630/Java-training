
import java.util.Scanner;

public class checkOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value");
        int A = sc.nextInt();
        System.out.println("enter value");
        int B = sc.nextInt();
        sc.nextLine();
        System.out.println("enter string value");
        String str = sc.nextLine();
        switch(str){
            case "nand":System.out.println(~(A&B));
            break;
            case "or":System.out.println(A|B);
            break;
            case "xor":System.out.println(~(A|B));
            break;
            case "and":System.out.println(A&B);
            break;
            default:System.out.println("default");
            break;
        }


        
        
    }
}