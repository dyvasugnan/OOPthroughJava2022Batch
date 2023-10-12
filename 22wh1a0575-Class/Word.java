import java.util.*;
class Word
{
    public static void main(String args[])
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter String");
	System.out.println("");
	String str=sc.nextLine();
	int len=str.length();
	char w;
	String str1="";
	str1=str1+str.charAt(0);
	for(int i=1; i<len; i++)
	{
	    w=str.charAt(i);
	    if(w==' ')
	    {
	        str1=str1+(str.charAt(i+1));
	    }
	}
	System.out.println("The new word formed by joining all first letters : "+str1);
    }
}