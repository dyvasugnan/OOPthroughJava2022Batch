import java.util.*;
class Panagram
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string : ");
        String str=sc.nextLine();
        str = str.toLowerCase();
        char array[] = str.toCharArray();
        Arrays.sort(array);
        str=new String(array);
        String str2="abdcefghijklmnopqrstuvwxyz";
        if(str.equals(str2))
        {
            System.out.println("String is panagram");
        }
        else
            System.out.println("String is not panagram");
    }
}