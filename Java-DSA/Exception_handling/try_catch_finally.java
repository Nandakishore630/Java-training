package Exception_handling;
 class try_catch_finally {
    public static void main(String[] args) {
        try {
            int a = 10 / 0; // This will throw an ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        } finally {
            System.out.println("This block will always execute.");
        }
    }
 
}