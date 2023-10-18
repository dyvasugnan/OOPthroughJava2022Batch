import java.util.*;
class  Area{
	double length,breadth,radius;
	float side ;
	void area(float side){
		this.side=side;
		System.out.println("enter the areas of square : "+(side*side));
	}
	void area (double length,double breadth){
		this.length=length;
		this.breadth=breadth;
		System.out.println("enter the areas ofrectagle :"+(length*breadth));
	}
	void area (double radius){
		this.radius=radius;
		System.out.println("enter the areas of radius : " +(radius*radius*3.14));
	}
}
public class TotalArea{
	public static void main(String[] args[]){
		Area a1=new Area();
		a1.area(3.1f);
		Area a2=new Area();
		a2.area(4.5);
		Area a3=new Area();
		a3.area(1.2,2.4);
	}
}