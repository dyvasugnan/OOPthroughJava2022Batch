import java.util.*;
import java.io.*;
public class searchCity {
    public static void main(String args[]) throws Exception {
        InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);	
       System.out.println("Enter the number of cities: ");
        String s = br.readLine();
        int n = Integer.parseInt(s);
        String[] cities = new String[n];

        System.out.println("Enter cities separated by spaces: ");
        StringTokenizer allCities= new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
                cities[i] = allCities.nextToken().trim();
        }

        System.out.println("Enter the city to be searched: ");
        String search = br.readLine().trim();
        int cityIndex = -1;

        for (int i = 0; i < n; i++) {
            if (cities[i].equals(search)) {
                cityIndex = i;
                break;
            }
        }

        if (cityIndex == -1) {
            System.out.println("City not found.");
        } else {
            System.out.println("City found at index: " + cityIndex);
        }
    }
}