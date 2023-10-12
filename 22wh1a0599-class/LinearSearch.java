import java.util.*;
class LinearSearch {
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		String cities[]=new String[2];
		int temp=0;
		System.out.println("Enter the city names :");
		for(int i=0;i<2;i++)
		{
			cities[i]=sc.next();
		}
		System.out.println("Enter the city to be searched :");
		String searching_city=sc.next();
		for(int i=0;i<2;i++)
		{
			if(cities[i].equals(searching_city))
			{
				temp=1;
				break;
			}

		}
		if (temp==1)
		{
			System.out.println("City name found");
		}
		else
		{
			System.out.println("City name not found");
		}

	}
}