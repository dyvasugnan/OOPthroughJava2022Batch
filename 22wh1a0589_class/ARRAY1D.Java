import java.io.*;
import java.util.*;

abstract class OneD {
    int m;
    int[] arr;

    public OneD() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the size of the 1D array: ");
        this.m = Integer.parseInt(br.readLine());
        this.arr = new int[m];
        System.out.println("Enter the elements for the 1D array: ");
        for (int i = 0; i < m; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
    }

    abstract void printArray();
}

class TwoD extends OneD {
    int n;