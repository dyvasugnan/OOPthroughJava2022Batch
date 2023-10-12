import java.io.*
class ConcateFirstLetterOfWords{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter the sentence: ");
	String s=br.readLine();
	String words[]=s.split(" ");
	int len=words.length;
	for(int i=0;i<len;i++)
	{
		String word=words[i];
		if(word.length()>0)
		{ 
			System.out.println("The first letter of the given words are: "+wordcharAt(0));
		}
	}
}
}
			