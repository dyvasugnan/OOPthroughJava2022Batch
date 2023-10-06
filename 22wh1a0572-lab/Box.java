import java.util.*;
class Box{
 float l,b,h;
 
 Box(){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter box dimensions:");
  l=sc.nextFloat();
  h=sc.nextFloat();
  b=sc.nextFloat();
} 
 double volume(){
   return l*b*h;}


 public static void main(String args[]){
  Box b1=new Box();
  System.out.println(b1.volume());
  Box b2=new Box();
  System.out.println(b2.volume());
}}