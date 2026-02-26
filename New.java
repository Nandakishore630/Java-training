
import java.util.Scanner;
class New{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        switch (str) {
            case "AND":
                System.out.println(m & n);
                break;
            case "OR":
                System.out.println(m | n);
                break;
            case "XOR":
                System.out.println(m ^ n);
                break;
            case "NAND":
                System.out.println(~(m & n));
                break;
            default: System.out.println("Invalid Operation");
                break;
        }
    }
}