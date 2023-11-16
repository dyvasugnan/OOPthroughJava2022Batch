class Demo{
    void getSwap(int a, int b){
        System.out.println("before swapping \n " +a +" " + b+" ");
        int temp;
        temp = b;
        b = a;
        a = temp;
        System.out.println("after swapping \n " + a +" " + b+" ");
    }
}
class Swap {
    public static void main(String[] args){
        int x = 10;
        int y = 20;
        Demo s = new Demo();
             s.getSwap(x,y);
    }
}