package Arrays;
public class TwoD_Array {
    

    public static void main(String[] args) {

        // declaration and initialization
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println("Matrix Elements:");

        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // accessing element
        System.out.println("Element at row 1 column 2: " + matrix[1][2]);

        // updating element
        matrix[0][1] = 100;

        System.out.println("Updated Matrix:");

        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
    

