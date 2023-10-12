import java.util.*;
import java.lang.*;
class FirstLetter {
    public static void main(String[] args) {
        int i;
        System.out.println("Enter the sentence: ");
        Scanner sc=new Scanner(System.in);
        String sentence=sc.nextLine();
        //String sentence="Welcome to bvrith college";
        
        for (i=0;i<sentence.length();i++)
        {
            char c=sentence.charAt(i);
            if (i==0)
            {
                System.out.print(Character.toLowerCase(c));
                
            }
            else if(c==' ')
            {
                System.out.print(sentence.charAt(i+1));
            }
            else
            {
                continue;
            }
        }
    }
}