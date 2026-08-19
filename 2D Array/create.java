import java.util.Scanner;

public class create {

    public static void main(String args[]) {

        int matrix[][] = new int[3][3];

        int n = 3;
        int m = 3;
        int key;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the matrix:");

        // Input
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the key:");
        key = sc.nextInt();

        // Search key
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {

                if(matrix[i][j] == key) {
                    System.out.print(matrix[i][j] + " ");
                }

            }
            System.out.println();
        }

        sc.close();
    }
}