package Arrays;
public class OneD_Array {

    public static void main(String[] args) {

        // declaration and initialization
        int[] arr = {10,20,30,40,50};

        // printing array elements
        System.out.println("Array Elements:");

        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

        // accessing element
        System.out.println("Element at index 2: " + arr[2]);

        // updating element
        arr[2] = 100;
        System.out.println("Updated value: " + arr[2]);

        // sum of elements
        int sum = 0;

        for(int i=0;i<arr.length;i++)
        {
            sum = sum + arr[i];
        }

        System.out.println("Sum of elements: " + sum);
    }
} 
