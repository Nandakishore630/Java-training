package Exception_handling;
class try_catch {
    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;

            int c = a / b;
            System.out.println(c);
        }

        catch(ArithmeticException e) {
            System.out.println("Division by zero is not allowed");
        }

        System.out.println("Program continues");
    }
}