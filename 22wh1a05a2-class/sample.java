import java.util.*;
class concatenate{
public static void main(String[] args)
{
String s="welcome to java";
String result=concatenate(s);
System.out.println("result="+result);
}
public static String concatenate(String input)
{
String[] words = input.split(" ");
String result=" ";
for(String word : words)
{
if(!word.isEmpty()){
result+= word.charAt(0);
}
}
return result;
}
}

