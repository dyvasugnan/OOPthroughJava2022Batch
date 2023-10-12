import java.util.*;
class Cities {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,count=0;
        System.out.println("Enter the size of array:");
        int size=sc.nextInt();
        String cities[]=new String[size];
        System.out.println("Enter the Names of city:");
        for(i=0;i<size;i++)
        {
            cities[i]=sc.next();
        }
        System.out.println("Enter the name of city to be searched:");
        String search=sc.next();
        for(i=0;i<size;i++)
        {
            if (search.equals(cities[i]))
            {
                count=1;
                break;
            }
        }
        if(count==1)
        {
            System.out.println("City is found at "+ (i+1));
        }
        else
        {
            System.out.println("City is not found!");
        }
    }
}
