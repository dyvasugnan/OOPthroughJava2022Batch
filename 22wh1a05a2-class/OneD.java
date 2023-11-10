import java.util.Scanner;

public class OneD {
    int[] array;
    int r;
    Scanner sc = new Scanner(System.in);

    void get1d() {
        System.out.println("Enter size of 1D array");
        r = sc.nextInt();
        array = new int[r];
        System.out.println("Enter 1D array elements");
        for (int i = 0; i < r; i++) {
            array[i] = sc.nextInt();
        }
    }
}

class DisplayA extends OneD {
    void display() {
        System.out.println("1D Array Elements:");
        for (int i = 0; i < r; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

class Array2D extends OneD {
    int[][] array2;
    int c;

    void get2D() {
        System.out.println("Enter number of columns for 2D array");
        c = sc.nextInt();
        array2 = new int[r][c];
	System.out.println("enter 2d array elements");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                //array2[i][j] = array[i];
		array2[i][j]=sc.nextInt();
            }
        }
    }
}

class DisplayB extends Array2D {
    void display2() {
        System.out.println("2D Array Elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
class Array3D extends Array2D{
int[][][] array3;
int s;
void get3D(){
System.out.println("enter size of 3d array");
s=sc.nextInt();
array3 = new int[r][c][s];
System.out.println("enter 3d array elements");
for(int i=0;i<r;i++){
for(int j=0;j<c;j++){
for(int k=0;k<s;k++){
array3[i][j][k]=sc.nextInt();
}
}
}
}
}
class DisplayC extends Array3D{
void display3(){
System.out.println("3d array elements:");
for(int i=0;i<r;i++){
for(int j=0;j<c;j++){
for(int k=0;k<s;k++){
System.out.print(array3[i][j][k] + " ");
}
System.out.println();
}
System.out.println();
}
}
}
class Main {
    public static void main(String[] args) {
	DisplayC d2= new DisplayC();
	d2.get3d();
	d2.display3();
    }
}
