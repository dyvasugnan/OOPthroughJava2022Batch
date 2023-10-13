import java.util.8;
class Capitalize{
public static void main(String[] args){
String str="welcome to bvrit";
string result=Capitalize(str);
system.out.println("capitalize:"+result);
}
public static string Capitalize(String input){
string[] words=input.split(" ");
string result= " ";
for(String word:words){
if(!word.isEmpty()){
if(!word.isEmpty()){
result+=character.toUpperCase(word.charAt(0))+word.subString(1)+" ";
}