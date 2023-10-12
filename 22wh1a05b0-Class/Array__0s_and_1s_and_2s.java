import java.util.Scanner;

public class Array__0s_and_1s_and_2s {
    public static void main (String[] args){
        int[] arr = new int[10];
        int size;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of elements in array");
        size=scan.nextInt();
        System.out.println("Enter Array Elements consisting of 0s,1s,2s:");
        for(int i=0;i<size;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println("Entered Array:");
        for(int i=0;i<size;i++){
            System.out.print(" ");
            System.out.print(arr[i]);
            System.out.print(" ");        
        }
        int[] new_array = new int[arr.length];
        int j=0;

        //appending 0s
        for(int i=0;i<arr.length;i++){
            if (arr[i] == 0){
                    new_array[j] = arr[i];
                    j++;
            }
        }
        //appending 1s
        for(int i=0;i<arr.length;i++){
            if (arr[i] == 1){
                    new_array[j] = arr[i];
                    j++;
            }
        }
        //appending 2s
        for(int i=0;i<arr.length;i++){
            if (arr[i] == 2){
                    new_array[j] = arr[i];
                    j++;
            }
        }
        System.out.println(" ");
        System.out.println("New array is: ");
        for(int i=0;i<new_array.length;i++){
            System.out.print(" ");
            System.out.print(new_array[i]);
            System.out.print(" ");
    }
    scan.close();
}
}