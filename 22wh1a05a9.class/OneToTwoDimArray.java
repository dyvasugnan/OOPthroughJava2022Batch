import java.util.*;
class Superclass {
    public int[] oneDimArray;
    public Superclass(){
        oneDimArray = new int[]{1, 2, 3, 4, 5};
    }
}
class Subclass extends Superclass {
    protected int[][] twoDimArray;
    public Subclass() {
        twoDimArray = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int index = i * 3 + j;
                if (index < oneDimArray.length) {
                    twoDimArray[i][j] = oneDimArray[index];
                } else {
                   Scanner sc=new Scanner(System.in);
                   System.out.print("enter a number");
                   int a=sc.nextInt();
                    twoDimArray[i][j] =a ;
                }
            }
        }
    }

    public void printTwoDimArray() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(twoDimArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class Main {
    public static void main(String[] args) {
        Subclass subclass = new Subclass();
        subclass.printTwoDimArray();
    }
}
