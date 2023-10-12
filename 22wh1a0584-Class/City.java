import java.lang.*;
import java.util.*;

class City{
    public static void main(String[] args) {
        int i;
        System.out.println("Enter the city names");
        String city[]=new String[5];
        Scanner sc=new Scanner(System.in);
       
        for (i=0;i<5;i++)
        {
            city[i]=sc.nextLine();
            
        }
        for (i=0;i<5;i++)
        {
            System.out.println(city[i]);
        }
        System.out.println("Enter the city you want:");
        String name=sc.nextLine();
        
        boolean city_found=false;
        for (i=0;i<5;i++)
        {
            if (city[i].equals(name))
            {
                city_found=true;
                break;
            }
        }
        if (city_found)
        {
                System.out.println("City Found");
        }
        else{
                System.out.println("City not found");
        }
    }
}