import java.io.*;
public class CitySearch {
    public static void main(String[] args) throws IOException {
        String[] cityNames = {"New York", "Hyderabad","Chennai","Delhi","Mumbai","Agra","Dubai","Bangalore","Paris","France"};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a city name to search: ");
        String searchCity = br.readLine();
        String foundCity = null;
        for (String city : cityNames) {
            if (city.equals(searchCity)) {
                foundCity = city;
                break;
            }
        }
        if (foundCity != null) {
            System.out.println(searchCity + " is in the list of cities.");
        } else {
            System.out.println(searchCity + " is not in the list of cities.");
        }
    }
}
