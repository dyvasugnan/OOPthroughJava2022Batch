import java.util.Scanner;
class Area{
	void Area(int length,int breadth)
	{
		System.out.println("Calculating rectangle area");
		int rectangle_area=length*breadth;
		System.out.println(rectangle_area);
	}
	void Area(int base,float height)
	{
		System.out.println("Calculating triangle area");
		float triangle_area=((base*height)/2);
		System.out.println(triangle_area);
	}
	void Area(double radius)
	{
		System.out.println("calculating circle area");
		double circle_area=(2*3.14*radius);
		System.out.println(circle_area);
	}
}
class Area_cal
{
	public static void main(String[] args)
	{
		Area a1=new Area();
                a1.Area(2,3);
		a1.Area(2,3.5f);
		a1.Area(3.5);
	}
	}		
}