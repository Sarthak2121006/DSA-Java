public class spiral {

    public static void printspiral(int matrix[][]) {
        int row = 0;
        int col = 0;
        int rowend = matrix.length - 1;
        int colend = matrix[0].length - 1;

        while (row <= rowend && col <= colend) {
            for (int j = col; j <= colend; j++) {
                System.out.print(matrix[row][j] + " ");
            }

            for (int i = row + 1; i <= rowend; i++) {
                System.out.print(matrix[i][colend] + " ");
            }

            for (int j = colend - 1; j >= col; j--) {
                if (row == rowend) {
                    break;
                }
                System.out.print(matrix[rowend][j] + " ");
            }

            for (int i = rowend - 1; i >= row + 1; i--) {
                if (col == colend) {
                    break;
                }
                System.out.print(matrix[i][col] + " ");
            }

            row++;
            col++;
            rowend--;
            colend--;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int matrix[][] = {
           {10, 20, 30},
           {40, 50, 60},
           {70, 80, 90}
        };

        printspiral(matrix);
    }
}
