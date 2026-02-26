import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        // int i=1;
        // for (System.out.println("1");i<5;System.out.println("+")) {
        //     System.out.println(i);
        // i++;
        // }
        // while(i<5){
        //     System.out.println(i);
        //     i++;
        // }
        // do{
        //     System.out.println(i);
        //     i++;
        // }while(i<5);

        //TABLE 
        // while(i<11){
        //         System.out.println(i+"*"+5+"="+i*5);
        //         i++;
        //     }

        //EVEN NUMBER
        // while(i<20){
        //         System.out.println(i%2==0?i:"");
        //         i++;
        // }
        //Factor of a number
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=1;i<=num;i++){
            i++;
            System.out.println(num%i==0?i:"");  
        }
    }
}   
