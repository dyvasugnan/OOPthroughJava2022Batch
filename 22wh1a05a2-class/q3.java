import java.util.*;
class capitalise{
public static void main(String[] args)
{
String s="welcome to java";
String result = capitalise(s);
System.out.println("result="+result);
}
public static String capitalise(String input)
{
String[] words = input.split(" ");
String result=" ";
for(String word : words)
{
if(!word.isEmpty()){
result+= Character.toUpperCase(word.charAt(0)) + word.substring(1)+" ";
}
}
return result;
}
}

