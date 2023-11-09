import java.util.Scanner;
class OneD {
    Scanner sc = new Scanner(System.in);
    int size;
    int arr1[];
    void getSize() {
        System.out.println("Enter size of 1D array");
        size = sc.nextInt();
        arr1 = new int[size];
    }
    void getData() {
        System.out.println("Enter 1D Array elements");
        for (int i = 0; i < size; i++) {
            arr1[i] = sc.nextInt();
        }
    }
    void displayData() {
        System.out.println("Displaying 1D Array elements");
        int j ;
        for (j=0;j<size;j++) {
            System.out.print(arr1[j]+" ");
        }
        System.out.println();
    }
}
class TwoD extends OneD{
    int arr2[][];
    int rows;
    void getSize(){
        super.getSize();
        System.out.println("no.of rows for 2D array : "+size);
        System.out.println("Enter no.of columns for 2D array : ");
        rows=sc.nextInt();
        arr2=new int[size][rows];
    }
    void getData(){
        super.getData();
        System.out.println("Enter 2D Array elements");
        for(int i=0;i<size;i++){
            for(int j=0;j<rows;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
    }
    void displayData(){
        super.displayData();
        System.out.println(" Displaying 2D array elements");
        for(int i=0;i<size;i++){
            for(int j=0;j<rows;j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
    }
}
class ThreeD extends TwoD{
    int arr3[][][];
    int columns;
    void getSize(){
        super.getSize();
        System.out.println("No.of 2D Arrays in 3D array :"+size);
        System.out.println("No.of rows of 3D Array :"+rows);
        System.out.println("Enter no.of columns 2D Arrays :");
        columns=sc.nextInt();
        arr3=new int[size][rows][columns];
    }
    void getData(){
        super.getData();
        System.out.println("Enter 3D Array elements");
        for(int i=0;i<columns;i++){
            for(int j=0;j<rows;j++){
                for(int k=0;k<size;k++){
                    arr3[i][j][k]=sc.nextInt();
                }
            }
        }
    }
    void displayData(){
        super.displayData();
        System.out.println("Displaying 3D Array elements");
        for(int i=0;i<columns;i++){
            for(int j=0;j<rows;j++){
                for(int k=0;k<size;k++)
                    System.out.print(arr3[i][j][k]+" ");
                System.out.println();
            }
        }
    }
}
class Arrays {
    public static void main(String[] args) {
        ThreeD t = new ThreeD();
        t.getSize();
        t.getData();
        t.displayData();
    }
}