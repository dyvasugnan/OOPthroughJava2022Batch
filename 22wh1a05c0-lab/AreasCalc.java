import java.util.*;
class Area{
	double circle,triangle,rectangle;
	void circleArea(float r){
		circle=3.14*r*r;
		System.out.println("Area of Circle : "+circle);
	}
        void rectangleArea(float l,float b){
		rectangle=l*b;
		System.out.println("Area of Rectangle : "+rectangle);
	}
	void triangleArea(float b,float h){
		triangle=0.5*b*h;
		System.out.println("Area of Triangle : "+triangle);
	}
	}
public class AreasCalc{
	public static void main(String[] args){
	 	Area a=new Area();
		a.circleArea(5.5f);
		a.rectangleArea(2.4f,5.7f);
		a.triangleArea(3.8f,4.6f);
}
}

