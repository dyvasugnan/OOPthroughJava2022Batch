import java.io.*;

class City {
    public static void main(String[] args) throws IOException {
        String[] cities = new String[10];
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("Enter the cities");
        int i,index=0;
        for ( i = 0; i < 10; i++) {
            cities[i] = br.readLine();
        }
        System.out.print("Enter search_city");
        String search_city = br.readLine();
        boolean key = false;
        for ( i = 0; i < 10; i++) {
            if (cities[i].equals(search_city)) {
                key = true;
                index=i;
                break;
            }
        }
        if (key) {
            System.out.print("City found at: "+index);
        }
        else{
            System.out.print("city not found");
        }
    }
}