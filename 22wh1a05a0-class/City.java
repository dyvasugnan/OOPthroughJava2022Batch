import java.util.*;
class City {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String cities[]=new String[15];
		int temp=0;
		System.out.println("Enter the names of the cities ");
		for(int i=0;i<5;i++)
		{
			cities[i]=s.next();
		}
		System.out.println("Enter the city to be searched :");
		String search_city=s.next();
		for(int i=0;i<5;i++)
		{
			if(cities[i].equals(search_city))
			{
				temp=1;
				break;
			}

		}
		if (temp==1)
		{
			System.out.println("found");
		}
	}
}
