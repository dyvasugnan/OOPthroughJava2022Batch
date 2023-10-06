import java.util.*;
class Box2{
 double l,w,h;
 
 Box2(double a,double b,double c){
  l=a;
  h=b;
  w=c;
} 
 double volume(){
   return l*w*h;}


 public static void main(String args[]){
  Box2 b1=new Box2(1,10,10);
  System.out.println(b1.volume());
  Box2 b2=new Box2(2.5,2.0,2.0);
  System.out.println(b2.volume());
}}