import java.util.Scanner;
public class CitySearch {
    public static int linearSearch(String[] cities, String targetCity) {
        for (int i = 0; i < cities.length; i++) {
          if (cities[i].toLowerCase().equals(targetCity.toLowerCase())) {
             return i;
        }

        }
        return -1; 
    }
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] cities = new String[5];
        System.out.println("Enter 5 cities:");
        for (int i = 0; i < 5; i++) {
            cities[i] = scanner.nextLine();
        }
        System.out.println("Enter a city to search for:");
        String targetCity = scanner.nextLine();
        int result = linearSearch(cities, targetCity);
        if (result != -1) {
            System.out.println("City found at index " + result);
        } else {
            System.out.println("City not found.");
        }
    }
}
