import java.lang.*;
import java.io.*;
class Data{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] city = new String [10];
        System.out.println("enter the citys");
        for(int i=0;i<10;i++){
            city[i] = br.readLine();
        }
        System.out.println("Enter the city to search:");
        String search_city = br.readLine();
        Boolean found = false;
        for(int i =0;i<city.length;i++){
            if(city[i].equals(search_city)){
                found = true;
                break;
            }
        }
        if (found){
            System.out.println("Found the city");
        }
        else{
            System.out.println("city is not found");
        }
        
    }
}