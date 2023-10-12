import java.util.*;
import java.io.*;
class LinearSearch
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter size");
        String size=br.readLine();
        int s =Integer.parseInt(size);
        String city[]=new String[s];
        for(int i=0;i<s;i++)
        {
            city[i]=br.readLine();
        }
        System.out.println("enter search city");
        String search=br.readLine();
        int count=0;
        int j=0;
        for(j=0;j<s;j++)
        {
            if(city[j].equals(search))
            {
                count=1;
                break;
            }
        }
        if(count==1)
        {
            System.out.println("City is found at position "+(j+1));
        }
        else
        System.out.println("City not found");
    }
}