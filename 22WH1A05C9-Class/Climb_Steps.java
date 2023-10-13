import java.util.*;
import java.io.*;

class Climb_Steps {
    int cal_climbing_ways(int n) {
        if (n <= 2) {
            return n;
        } 
	else {
            return cal_climbing_ways(n - 1) + cal_climbing_ways(n - 2);
        }
    }
}

class Data {
    public static void main(String[] args) throws IOException {
        Climb_steps cs = new Climb_steps();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of steps: ");
        String s = br.readLine();
        int num = Integer.parseInt(s);
        System.out.println("Number of ways to climb " + num + " steps: " + cs.cal_climbing_ways(num));
    }
}