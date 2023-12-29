public class Players_allotment {
	public static void main(String[] args){
		int test_matches = 5;
		int ODI = 105;
		boolean mom = true;
		int ipl = 15;
		if (test_matches>10 && ODI>99)
		{
			System.out.println("Congratulations Player!! You received Rs.50,000");
		}
		else if (test_matches>10)
		{
			System.out.println("Congratulations Player!! You received Rs.25,000");
		}
		else if (ODI>100)
		{
			System.out.println("Congratulations Player!! You received Rs.15,000");
		}
		else if (test_matches>=1 && ODI>=1)
		{
			System.out.println("Congratulations Player!! You received Rs.10,000");
		}
		else
		{
			System.out.println("");
		}
		
	}
	
}

