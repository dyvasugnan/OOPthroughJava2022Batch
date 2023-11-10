import java.util.Scanner;

public class Main {
    static class OneD {
        Scanner sc = new Scanner(System.in);
        int n1 = 6, i, j;
        int a[] = new int[10];

        void get1() {
    for (i = 0; i < n1; i++) {
        a[i] = sc.nextInt();
    }
}
        public void show1() {
            System.out.println("One D array");
            for (int j = 0; j < n1; j++) {
                System.out.print(a[j] + " ");
            }
        }
    }

    static class TwoD extends OneD {
        int n2 = 3;
        int m2 = 2;
        int b[][] = new int[10][10];
        int index = 0;

        public void get2() {
            index = 0; 
            for (i = 0; i < n2; i++) {
                for (j = 0; j < m2; j++) {
                    b[i][j] = a[index++];
                }
            }
            System.out.println();
        }

        public void show1() {
            System.out.println("Two D array");
            for (i = 0; i < n2; i++) {
                for (j = 0; j < m2; j++) {
                    System.out.print(b[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    static class ThreeD extends TwoD {
        int n3 = 2, k;
        int c[][][] = new int[10][10][10];
        ThreeD(int ni){
            n3=ni;
        }

       void get3() {
    
    for (i = 0; i < 2; i++) {
        for (j = 0; j < 2; j++) {
            for (k = 0; k < 2; k++) {
                c[i][j][k] = sc.nextInt();
            }
        }
    }
}

        public void show3() {
            System.out.println("Three D array");
            for (i = 0; i < 2; i++) {
                for (j = 0; j < 2; j++) {
                    for (k = 0; k < 2; k++) {
                        System.out.print(c[i][j][k] + " ");
                    }
                    System.out.println("");
                }
                System.out.println("");
            }
        }
    }

    public static void main(String[] args) {
        ThreeD th = new ThreeD(2);
        th.get1();
        th.show1();
        th.get2();
        //th.show2();
        th.get3();
        th.show3();
    }
}
