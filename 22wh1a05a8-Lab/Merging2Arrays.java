import java.util.Scanner;
public class Merging2Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array 1");
        int n1 = sc.nextInt();
        int a[] = new int[n1];
        System.out.println("Enter Array 1");
        for (int i = 0; i < n1; i++) 
            a[i] = sc.nextInt();
        System.out.println("Enter the size of Array 2");
        int n2 = sc.nextInt();
        int b[] = new int[n2];
        System.out.println("Enter Array 2");
        for (int i = 0; i < n2; i++) 
            b[i] = sc.nextInt();
        merge(a, n1, b, n2);
    }
    public static void merge(int[] a, int n1, int[] b, int n2) {
        int[] c = new int[n1 + n2];
        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            if (a[i] <= b[j]) {
                c[k] = a[i];
                i++;
            } else {
                c[k] = b[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            c[k] = a[i];
            i++;
            k++;
        }
        while (j < n2) {
            c[k] = b[j];
            j++;
            k++;
        }
        System.out.println("Merged Array:");
        for (i = 0; i < n1 + n2; i++) 
            System.out.println(c[i]);
    }
}
