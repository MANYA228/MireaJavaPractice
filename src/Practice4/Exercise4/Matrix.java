package Practice4.Exercise4;

public class Matrix {
    private double[][] data;
    private int rows;
    private int cols;

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        data = new double[rows][cols];
    }

    public Matrix(double[][] data) {
        this.rows = data.length;
        this.cols = data[0].length;
        this.data = data;
    }

    public void add(Matrix other) {
        if (this.rows != other.rows || this.cols != other.cols) {
            System.out.println("Matrix dimensions are not compatible for addition.");
            return;
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                this.data[i][j] += other.data[i][j];
            }
        }
    }

    public void multiplyByScalar(double scalar) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                this.data[i][j] *= scalar;
            }
        }
    }

    public void print() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        double[][] matrixData1 = {
                {1.0, 2.0},
                {3.0, 4.0}
        };

        double[][] matrixData2 = {
                {5.0, 6.0},
                {7.0, 8.0}
        };

        Matrix matrix1 = new Matrix(matrixData1);
        Matrix matrix2 = new Matrix(matrixData2);

        System.out.println("Matrix 1:");
        matrix1.print();

        System.out.println("\nMatrix 2:");
        matrix2.print();

        System.out.println("\nAfter addition:");
        matrix1.add(matrix2);
        matrix1.print();

        System.out.println("\nAfter multiplication by scalar (2.0):");
        matrix1.multiplyByScalar(2.0);
        matrix1.print();
    }
}
