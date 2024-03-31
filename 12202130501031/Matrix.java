class Matrix {

    int row, column;
    float mat[][];

    // Constructor to initialize a matrix from a 2D array
    Matrix(int a[][]) {
        row = a.length;
        column = a[0].length;
        mat = new float[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                mat[i][j] = a[i][j];
            }
        }
    }

    // Default constructor to create an empty matrix
    Matrix() {
        row = 0;
        column = 0;
    }

    // Constructor to create a matrix with specified dimensions
    Matrix(int row, int col) {
        this.row = row;
        this.column = col;
        mat = new float[row][column];
    }

    // Function to read elements of the matrix
    void readMatrix() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                mat[i][j] = sc.nextFloat();
            }
        }
    }

    // Function to find the transpose of the matrix
    float[][] transpose() {
        float[][] transpose = new float[column][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                transpose[j][i] = mat[i][j];
            }
        }
        return transpose;
    }

    // Function to multiply two matrices
    float[][] matrixMultiplication(Matrix second) {
        if (column != second.row) {
            System.out.println("Matrices cannot be multiplied.");
            return null;
        }
        float[][] result = new float[row][second.column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < second.column; j++) {
                for (int k = 0; k < column; k++) {
                    result[i][j] += mat[i][k] * second.mat[k][j];
                }
            }
        }
        return result;
    }

    // Function to display the content of a matrix
    void displayMatrix(float[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Function to display the content of the current matrix
    void displayMatrix() {
        displayMatrix(mat);
    }

    // Function to find the maximum element of the matrix
    float maximum_of_array() {
        float max = mat[0][0];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (mat[i][j] > max) {
                    max = mat[i][j];
                }
            }
        }
        return max;
    }

    // Function to find the average of the matrix elements
    float average_of_array() {
        float sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                sum += mat[i][j];
            }
        }
        return sum / (row * column);
    }
}
