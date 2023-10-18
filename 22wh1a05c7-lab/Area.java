import  java.util.*;
 class Area{
                 void  area(int length,int  breadth){
                        System.out.println("Area of rectangle:"+length*breadth);
                 }
                 void  area(double breadth,double height){
                       System.out.println("Area of triangle:"+0.5*breadth*height);
                  }
                 void  area(double radius){
                       System.out.println("Area of the radius:"+3.14*radius*radius);
                 }
}
class Result{
             public static void main(String[] args){
                    Area  a = new  Area();
                    a.area(4,5);
                    a.area(12.0,2.0);
                    a.area(4);
            }
}

                        
            
      
     
       
   
     
