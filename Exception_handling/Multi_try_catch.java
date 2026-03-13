package Exception_handling;
class Multi_try_catch {
     public static void main(String[] args) {

        try {
            int arr[] = new int[5];

            arr[10] = 50;

            int a = 10 / 0;
        }

        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index error");
        }

        catch(ArithmeticException e) {
            System.out.println("Arithmetic error");
        }
    }
}