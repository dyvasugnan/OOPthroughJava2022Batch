package cseb;
import java.util.Scanner;
abstract class AbstractClass {
		abstract void area(double x,double y);
	}
class Triangle extends AbstractClass{
	void area(double b,double h) {
		System.out.println("Triangle Area: "+0.5*b*h);
	}
}
class Rectangle extends AbstractClass{
	void area(double l,double b) {
		System.out.println("Rectangle Area: "+l*b);
	}
}
class Circle extends AbstractClass{
	void area(double r,double s) {
		System.out.println("Circle Area: "+3.14*r*r);
	}
}
class AbsClass{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle t=new Triangle();
		Rectangle r=new Rectangle();
		Circle c=new Circle();
		t.area(12.34, 6.12);
		r.area(13.21,6.12);
		c.area(4.13, 3.21);

	}

}