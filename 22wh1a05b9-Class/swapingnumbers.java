public class SwapNumbers {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;
        System.out.println("number 1= "+n1);
        System.out.println("number 2= "+n2);
        int temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println("number 1= " + n1);
        System.out.println("number 2= " + n2);
    }
}