import java.util.*;
class Panagram{
    public static void main(String[]args){
        int i;
        String caps="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string:");
        String str=sc.nextLine();
        String s=str.toUpperCase().trim();
        boolean p=true;
        for(i=caps.charAt(0);i<=caps.charAt(25);i++)
        {
            if(s.indexOf(i)==-1){
                p=false;
            }
        }
        if(p){
            System.out.println("given string is panagram");
        }
        else{
            System.out.print("not panagram");
        }
    }
}