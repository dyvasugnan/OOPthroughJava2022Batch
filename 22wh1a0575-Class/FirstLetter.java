import java.util.*;
class FirstLetter
{
    public static void main(String args[])
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter String : ");
	String str=sc.nextLine();
	int len=str.length();
	char w;
	String str1="";
	for(int i=0; i<len; i++)
	{
	    w=str.charAt(i);
	    if(w==' ')
	    {
	        str1=str1+w;
	        if(w>='a' || w<='z')
	        {
	            str1=str1+((char)(str.charAt(i+1)-32));
	            i++;
	        }
	    }
	    else if(i==0)
	    {
	        if(w>='a' || w<='z')
	        {
	            str1=str1+((char)(str.charAt(i)-32));
	        }
	        else
	            str1=str1+w;
	        
	    }
	    else
	    {
	        str1=str1+str.charAt(i);
	    }
	}
	System.out.println("The new String : "+str1);
    }
}