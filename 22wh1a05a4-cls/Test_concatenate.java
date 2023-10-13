public class Test_concatenate{
public static void main(String[] args){
Strimg str=:"Welconme to bvrit";
String result=Test_concatenate(str);
System.out.println("concatenatong the first letter");
}
public static String Test_concatenate(String input){
String[] words input.splitr(" ");
String result =" ";
for(String word.words){
if(!word.isEmpty()){
result+=word.charAr(0);
}
}
return result;
}
}