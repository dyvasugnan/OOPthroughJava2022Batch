import java.util.*;
class LinearSearch {
    int search(String arr[], int n, String x) {
        for (int i = 0; i < n; i++) {
            if (arr[i].equals(x)) {
                return i;
            }
        }
        return -1;
    }
}

class Demo {
    public static void main(String[] args) {
        LinearSearch l = new LinearSearch(); 
        String[] arr = { "Hyderabad", "Mumbai", "Chennai", "Bangalore" };
        int n = arr.length;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the city to be searched: ");
        String x = sc.next();
        int index = l.search(arr, n, x); 
        if (index == -1) {
            System.out.println("Element is not present in the array");
        } else {
            System.out.println("Element found at position " + index);
        }
    }
}
