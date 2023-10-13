class StepsClimbing {
    static int noOfWays(int n) {
        if (n <= 1) {
            return 1; 
        } 
        else {
            return noOfWays(n - 1) + noOfWays(n - 2);
        }
    }
    public static void main(String[] args) {
        int n = 5; 
        int ways = noOfWays(n);
        System.out.println("Number of ways to climb " + n + " steps: " + ways);
    }
}
