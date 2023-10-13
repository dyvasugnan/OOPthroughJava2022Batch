public class Count {
    public static int Steps(int n) {
        if (n == 1) {
            return 1;
        }
        else if(n==2){
          return 2;
        }
        return Steps(n - 1) + Steps(n - 2);
    }

    public static void main(String[] args) {
        int n = 5; 
        int count = Steps(n);
        System.out.println("count of different  ways " + n + " steps: " + count);
    }
}
