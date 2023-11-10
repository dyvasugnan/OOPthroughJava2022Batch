package javahvk;
import java.util.Scanner;
class Array1D {
    private int[] array;
    public Array1D(int size) {
        array = new int[size];
    }
    public void readElements() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
    }
    public void printArray() {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
class Array2D {
    private Array1D[] arrays;
    public Array2D(int numOfArrays, int sizeOfEachArray) {
        arrays = new Array1D[numOfArrays];
        for (int i = 0; i < numOfArrays; i++) {
            arrays[i] = new Array1D(sizeOfEachArray);
        }
    }
    public void readElements() {
        for (Array1D array : arrays) {
            array.readElements();
        }
    }
    public void printArrays() {
        for (Array1D array : arrays) {
            array.printArray();
        }
    }
}
public class ArraysInheritance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of arrays: ");
        int numOfArrays = scanner.nextInt();
        System.out.print("Enter the size of each array: ");
        int sizeOfEachArray = scanner.nextInt();
        Array2D array2D = new Array2D(numOfArrays, sizeOfEachArray);
        array2D.readElements();
        array2D.printArrays();
    }
}
