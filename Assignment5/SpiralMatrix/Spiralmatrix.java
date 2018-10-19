package Assignment5.SpiralMatrix;

public class Spiralmatrix {

    public void spiral(int matrix[][], int rowstart, int rowend, int colstart, int colend) {
        while (rowstart <= rowend || (colstart <= colend && rowstart <= rowend)) {
            for (int i = colstart; i <= colend; i++) {
                System.out.print(matrix[rowstart][i]); //prints first row
            }
            rowstart++;
            if (rowstart > rowend) {
                colstart++;
            } else if (colstart > colend) {
                rowstart++;
            }
            if (colstart <= colend) {
                for (int i = rowstart; i <= rowend; i++) {
                    System.out.print(matrix[i][colend]); //prints last column
                }
                colend--;
            }

            if (colstart <= colend) {
                for (int i = colend; i >= colstart; i--) {
                    System.out.print(matrix[rowend][i]); //prints last row
                }
                rowend--;
            }
            if (colstart > colend) {
                rowstart++;
            } else if (rowstart > rowend) {
                colstart++;
            }
            if (rowstart <= rowend) {
                for (int i = rowend; i >= rowstart; i--) {
                    System.out.print(matrix[i][colstart]);  //print first column
                }
                colstart++;
            }

        }
    }

    public static void main(String args[]) {
        int m = 0;
        int matrix[][] = new int[4][3];
        for (int i = 0; i < matrix.length; i++) {
            System.out.println();
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] = m);
                System.out.print("  ");
                m++;
            }
        }
        System.out.println();
        Spiralmatrix s = new Spiralmatrix();
        s.spiral(matrix, 0, matrix.length - 1, 0, matrix[0].length - 1);
    }
}
