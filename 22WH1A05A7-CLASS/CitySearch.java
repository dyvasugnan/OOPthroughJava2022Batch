public class CitySearch {
    public static void main(String[] args) {
        String s = "hyderabad,khammam,warangal,nizambad";
        String scity = "khammam";
        boolean x = searchCity(s, scity);
        if (x) {
            System.out.println("City found in the text.");
        } else {
            System.out.println("City not found in the text.");
        }
    }
    public static boolean searchCity(String s, String city) {
        return s.contains(city);
    }
}
