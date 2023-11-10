class Array1D {
   int rows;
   int col;
}

class Array2D extends Array1D {
    int rows;
    int cols;
}

class Array2D(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
    }

class Array3D extends Array2D {
    private int depth;

    public Array3D(int rows, int cols, int depth) {
        super(rows, cols);
        this.depth = depth;
    }

public class Main {
    public static void main(String[] args) {
        Array1D array1D = new Array1D(5);
        array1D.setElement(2, 10);
        System.out.println(array1D.getElement(2));

        Array2D array2D = new Array2D(3, 4);
        array2D.setElement(1, 2, 5);
        System.out.println(array2D.getElement(1, 2));

        Array3D array3D = new Array3D(2, 2, 2);
        array3D.setElement(0, 1, 1, 8);
        System.out.println(array3D.getElement(0, 1, 1));
    }
}
