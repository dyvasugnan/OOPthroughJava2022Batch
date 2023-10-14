public class StringMerge {



	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		String s1=sc.nextLine();

		String s2=sc.nextLine();

		sc.close();

		int i;

		int len1=s1.length();

		int len2=s2.length();

		String space="";

		for(i=0;i<len1;i++)

		{

			if (i%2==0)

			{

				space+=s1.substring(i,i+1);

			}

			

		}

		

		for(i=0;i<len2;i++)

		{

			if (i%2==0)

			{

				space+=s2.substring(i,i+1);

			}

			

		}

		

		for(i=0;i<len1;i++)

		{

			if (i%2!=0)

			{

				space+=s1.substring(i,i+1);

			}

			

		}

		

		

		for(i=0;i<len2;i++)

		{

			if (i%2!=0)

			{

				space+=s2.substring(i,i+1);

			}

			

		}

		System.out.println(space);

	}



}

