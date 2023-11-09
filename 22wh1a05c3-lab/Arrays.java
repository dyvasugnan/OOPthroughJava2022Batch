import java.util.Scanner;

class OneD {
    Scanner sc = new Scanner(System.in);
    int size;
    int[] a;

    OneD() {
        System.out.println("Enter the size for 1D:");
        this.size = sc.nextInt();
        this.a = new int[this.size];

        System.out.println(":>>");
        for (int i = 0; i < this.size; i++) {
            this.a[i] = sc.nextInt();
        }

        System.out.print("1D is:");
        for (int i : this.a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

class TwoD extends OneD {
    int cols;
    int[][] matrix;

    TwoD() {
        super(); 

        System.out.println("cols:");
        this.cols = sc.nextInt();
        this.matrix = new int[this.size][this.cols];

        System.out.println("Enter the elements of the 2D:");
        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < this.cols; j++) {
                System.out.print(":>> ");
                this.matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("2D is:");
        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < this.cols; j++) {
                System.out.print(this.matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class ThreeD extends TwoD {
    int layers, rows, columns;
    int[][][] threeDArray;

    ThreeD() {
        super();
        this.rows = this.size;
        System.out.println("rows: " + this.rows);
        this.columns = this.cols;
        System.out.println("columns: " + this.columns);
        System.out.println("k: ");
        this.layers = sc.nextInt();

        this.threeDArray = new int[this.layers][this.rows][this.columns];

        for (int layer = 0; layer < this.layers; layer++) {
            for (int row = 0; row < this.rows; row++) {
                for (int col = 0; col < this.columns; col++) {
                    System.out.print(":>> ");
                    this.threeDArray[layer][row][col] = sc.nextInt();
                }
            }
        }

        for (int layer = 0; layer < this.layers; layer++) {
            System.out.print("3D is:");
            System.out.println("k:" + layer + ">");
            for (int row = 0; row < this.rows; row++) {
                for (int col = 0; col < this.columns; col++) {
                    System.out.print(this.threeDArray[layer][row][col] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

class Arrays {
    public static void main(String[] args) {
        ThreeD t = new ThreeD();
    }
}

