package Practice14.Exercise5;

import java.util.Arrays;

public class Matrix<T extends Number> {
    private T[][] matrix;
    private int rows;
    private int cols;

    public Matrix(T[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            throw new IllegalArgumentException("Invalid matrix");
        }

        this.matrix = matrix;
        this.rows = matrix.length;
        this.cols = matrix[0].length;
    }

    public Matrix<T> add(Matrix<T> other) {
        if (this.rows != other.rows || this.cols != other.cols) {
            throw new IllegalArgumentException("Matrices must have the same dimensions for addition");
        }

        T[][] result = createMatrix(rows, cols);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = addElements(this.matrix[i][j], other.matrix[i][j]);
            }
        }

        return new Matrix<>(result);
    }

    public Matrix<T> multiply(Matrix<T> other) {
        if (this.cols != other.rows) {
            throw new IllegalArgumentException("Number of columns in the first matrix must be equal to the number of rows in the second matrix");
        }

        T[][] result = createMatrix(this.rows, other.cols);

        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < other.cols; j++) {
                result[i][j] = multiplyElements(this.getRow(i), other.getColumn(j));
            }
        }

        return new Matrix<>(result);
    }

    private T multiplyElements(T[] row, T[] col) {
        T result = getZeroElement();

        for (int i = 0; i < row.length; i++) {
            result = addElements(result, multiplyElements(row[i], col[i]));
        }

        return result;
    }

    private T[] getColumn(int colIndex) {
        if (colIndex < 0 || colIndex >= cols) {
            throw new IllegalArgumentException("Invalid column index");
        }

        T[] column = createArray(rows);

        for (int i = 0; i < rows; i++) {
            column[i] = matrix[i][colIndex];
        }

        return column;
    }

    private T[] getRow(int rowIndex) {
        if (rowIndex < 0 || rowIndex >= rows) {
            throw new IllegalArgumentException("Invalid row index");
        }

        return Arrays.copyOf(matrix[rowIndex], cols);
    }

    private T addElements(T a, T b) {
        return createNumber(a.doubleValue() + b.doubleValue());
    }

    private T multiplyElements(T a, T b) {
        return createNumber(a.doubleValue() * b.doubleValue());
    }

    private T getZeroElement() {
        return createNumber(0);
    }

    private T[][] createMatrix(int rows, int cols) {
        return (T[][]) new Number[rows][cols];
    }

    private T[] createArray(int length) {
        return (T[]) new Number[length];
    }

    private T createNumber(double value) {
        return (T) Double.valueOf(value);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (T[] row : matrix) {
            result.append(Arrays.toString(row)).append("\n");
        }
        return result.toString();
    }

    public static void main(String[] args) {
        // Пример использования класса Matrix
        Integer[][] data1 = {{1, 2}, {3, 4}};
        Integer[][] data2 = {{5, 6}, {7, 8}};

        Matrix<Integer> matrix1 = new Matrix<>(data1);
        Matrix<Integer> matrix2 = new Matrix<>(data2);

        System.out.println("Matrix 1:");
        System.out.println(matrix1);

        System.out.println("Matrix 2:");
        System.out.println(matrix2);

        Matrix<Integer> sumResult = matrix1.add(matrix2);
        System.out.println("Sum Result:");
        System.out.println(sumResult);

        Matrix<Integer> multiplyResult = matrix1.multiply(matrix2);
        System.out.println("Multiply Result:");
        System.out.println(multiplyResult);
    }
}

