import java.io.*;
class PlusOne {
    public static void main(String [] args) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int [] num = new int[3] ;
        int k;
        int i;

        System.out.println("Enter the numbers :");
        for ( i = 0 ; i <  num.length ; i++){
             String s = br.readLine();
             num[i] = Integer.parseInt(s);
        }

        k = num[num.length - 1] + 1;
        num[num.length - 1] = k;
 
        System.out.println("The updates array :");
        for ( i = 0 ; i <  num.length ; i++){
        System.out.print(num[i] + " ");
        
        } 
    }
}
