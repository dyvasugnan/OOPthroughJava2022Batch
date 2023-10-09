import java.util.*;
class Areas{
	double radius,length,breadth;
	float side;
	void area(float side){
		this.side=side;
		System.out.println("Area of the square : "+(side*side));
	}
	void area(double length,double breadth){
		this.length=length;
		this.breadth=breadth;
		System.out.println("Area of the rectangle : "+(length*breadth));
	}
	void area(double radius){
		this.radius=radius;
		System.out.println("Area of circle : "+(3.14*radius*radius));
	}
}
public class CalculateAreas{
	public static void main(String args[]){
		Areas a1=new Areas();
		a1.area(2.0f);
		Areas a2=new Areas();
		a2.area(6.4);
		Areas a3=new Areas();
		a3.area(3.2,1.2);
	}
}