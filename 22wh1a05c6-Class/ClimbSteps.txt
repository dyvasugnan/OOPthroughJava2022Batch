import java.util.*;
import java.io.*;

class ClimbSteps {
    int noOfWays(int n) {
        if (n <= 2) {
            return n;
        } 
	else {
            return noOfWays(n - 1) + noOfWays(n - 2);
        }
    }
}

class Data {
    public static void main(String[] args) throws IOException {
        ClimbSteps cs = new ClimbSteps();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of steps: ");
        String s = br.readLine();
        int num = Integer.parseInt(s);
        System.out.println("Number of ways to climb " + num + " steps: " + cs.noOfWays(num));
    }
}