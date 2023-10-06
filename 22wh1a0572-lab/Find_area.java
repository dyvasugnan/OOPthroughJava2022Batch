import java.util.*;
class Find_area{
 void area(float l,float b){
    System.out.println("Given dimensions of a rectangle.");
    System.out.println("It's area"+(l*b));
}
 void area(int h,int b){
    System.out.println("Given dimensions of a triangle.");
    System.out.println("It's area"+(0.5*b*h));
}
 void area(float r){
    System.out.println("Given radius of a circle.");
    System.out.println("It's area"+(3.14*r*r));
}
 void area(int s){
    System.out.println("Given side of a square.");
    System.out.println("It's area"+(s*s));
}

 public static void main(String args[]){
  Find_area obj=new Find_area();
  Scanner sc=new Scanner();
  
  obj.area(5);
  obj.area(3.5f);
  obj.area(5,10);
}}