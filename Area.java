import java.util.*;
class Area{
	void area(int breadth, int length){
		System.out.println("Area of Rectangle: " + length*breadth);
	}
	void area(double breadth, double height){
		System.out.println("Area of Triangle: " + 0.5*breadth*height);
	}
	
	void area(double radius){
		System.out.println("Area of Circle: " + 3.14*radius*radius);
	}
}
class Demo{
	public static void main(String[] args){
		Area a = new Area();
		a.area(5,6);
		a.area(8.0,10.0);
		a.area(4);
	}
}
