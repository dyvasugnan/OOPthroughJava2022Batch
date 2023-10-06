import java.lang.*;
import java.util.*;
class Boxs{
     int l,b,h;
     Boxs(int a,int d,int c){
	l=a;
	b=d;
	h=c;
	System.out.println("Aea is:"+(l*b*h));
      }
}
class Two{
   public static void main(String[ ] args){
        Boxs o=new Boxs(10,10,10);
   }
}