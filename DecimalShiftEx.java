import java.util.Scanner;

class DecimalShiftEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        double number = sc.nextDouble();  

        System.out.print("Enter number of positions to shift: ");
        int shift = sc.nextInt();

        double leftShift = number * Math.pow(10, shift);  
        double rightShift = number / Math.pow(10, shift);  

        System.out.println("Left Shift Result: " + leftShift);
        System.out.println("Right Shift Result: " + rightShift);

        sc.close();
    }
}