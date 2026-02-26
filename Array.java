import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
    int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
    int array[][] = new int[4][4];
    int new_arr[][] = new int[3][3];

    new_arr[0] = new int[2];
    new_arr[1] = new int[6];
    new_arr[2] = new int[3];

    for (int i=0;i<new_arr.length;i++){
        int value = sc.nextInt();
        new_arr[i]=new int[value];
    }
    System.out.println(new_arr[0].length);
    System.out.println(new_arr[1].length);
    System.out.println(new_arr[2].length);
}
}