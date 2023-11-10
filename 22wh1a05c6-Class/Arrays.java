import java.util.Scanner;

abstract class Array {       //abstract class
    Scanner sc = new Scanner(System.in);
    abstract void getdata();
    abstract void putdata();
}

class OneDimen extends Array {  //class Inheritance
    int size;
    int[] oneD;

    OneDimen(int size) {    //constructors
        this.size = size;
        oneD = new int[size];
    }

    void getdata() {
        System.out.println("Enter the values of 1D:");
        for (int i = 0; i < size; i++) {
            oneD[i] = sc.nextInt();
        }
    }

    void putdata() {
        System.out.println("One Dimensional Array:");
        //for (int i = 0; i < size; i++) {
        //    System.out.print(oneD[i] + " ");
        //}
        for(int value:oneD)  //for each loop
        {
            System.out.print(value+" ");
        }
        System.out.println();
    }
}

class TwoDimen extends Array {
    int rows;
    int columns;
    int[][] TwoD;

    TwoDimen(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        TwoD = new int[rows][columns];
    }
    //Method overriding
    void getdata() {
        System.out.println("Enter the Values of rows and columns:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                TwoD[i][j] = sc.nextInt();
            }
        }
    }
    //overriding
    void putdata() {
        System.out.println("Two Dimensional Array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(TwoD[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class ThreeDimen extends Array {
    int layers;
    int rows;
    int columns;
    int[][][] ThreeD;

    ThreeDimen(int layers, int rows, int columns) {
        this.layers = layers;
        this.rows = rows;
        this.columns = columns;
        ThreeD = new int[layers][rows][columns];
    }

    void getdata() {
        System.out.println("Enter the Values of 3D array");
        for (int i = 0; i < layers; i++) {
            System.out.println("Layer" + (i + 1) + ":");
            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < columns; k++) {
                    ThreeD[i][j][k] = sc.nextInt();
                }
            }
        }
    }

    void putdata() {
        System.out.println("3D array:");
        for (int i = 0; i < layers; i++) {
            System.out.println("Layer " + (i + 1) + ":");
            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < columns; k++) {
                    System.out.print(ThreeD[i][j][k] + " ");
                }
                System.out.println();
            }
        }
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size:");
        int size = sc.nextInt();
        OneDimen oneD = new OneDimen(size);
        oneD.getdata();
        oneD.putdata();

        System.out.println("Enter no of Rows:");
        int rows = sc.nextInt();
        System.out.println("Enter no of Columns:");
        int columns = sc.nextInt();
        TwoDimen TwoD = new TwoDimen(rows, columns);
        TwoD.getdata();
        TwoD.putdata();

        System.out.println("Enter no of Layers:");
        int layers = sc.nextInt();
        ThreeDimen ThreeD = new ThreeDimen(layers, rows, columns);
        ThreeD.getdata();
        ThreeD.putdata();
    }
}