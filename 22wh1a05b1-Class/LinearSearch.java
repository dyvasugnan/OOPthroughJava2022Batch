import java.util.*;

class LinearSearchString 
{
	int i;

	int search(String arr[],String x) 
	{
		for(i=0;i<arr.length;i++)
		{
			if(arr[i].equals(x))
			{
				return i;
			}
		}
		return -1;
	}

}
class LinearSearch 
{
	public static void main (String[] args) 
	{
		String city[] = {"Hyderabad","Delhi","Ahmedabad","Mumbai","Chennai","Vishakapatnam","Lucknow"};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enther the value to be searched: ");
		String value = sc.nextLine();
		LinearSearchString s = new LinearSearchString();
		int result = s.search(city,value);

		if (result!=-1)
		{
			System.out.println(value+" is found at " +result);
		}
		else
		{
			System.out.println(value+"is not found");
		}
	}
}



