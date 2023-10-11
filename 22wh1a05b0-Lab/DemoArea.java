import java.util.*;

class Area{
	int length,bredth;
	double base,height;
	double radius,areaCircle,areaTriangle,areaRectangle;
	//Area of Circle
	void area (double inputRadius){
		radius = inputRadius;
		areaCircle = 3.14*radius*radius;
		System.out.println("Area of the Circle with Radius " +radius+ " is: " +areaCircle);
	}
	//Area of Triangle
	void area (double inputBase, double inputHeight){
		base = inputBase;
		height = inputHeight;
		areaTriangle = 0.5*base*height;
		System.out.println("Area of the Triangle with Base " +base+ " and Height " +height+ " is: " +areaTriangle);
	}
	//Area of Rectangle
	void area (int inputLength, int inputBredth){
		length = inputLength;
		bredth = inputBredth;
		areaRectangle = length*bredth;
		System.out.println("Area of the Rectangle with Bredth " +bredth+ "and Height " +height+ " is: " +areaRectangle);
	}
	
}

class DemoArea{
	public static void main(String[] args){
		Area circle = new Area();  
		circle.area(3.14);
		Area triangle = new Area();  
		triangle.area(0.5,10);
		Area rectangle = new Area();  
		rectangle.area(10,5);

	}
}