class Find_Area{
	double Area(float length,float breadth){
		return length * breadth;
	}
	double Area(int side){
		return side * side;
	}
	double Area(double radius){
		return 3.14 * radius*radius;
	}
	double Area(double base,double height){
		  return 0.5 * base * height;
	}
}
class Display1{
	public static void main(String[] args){
		Find_Area a = new Find_Area();
		System.out.println(a.Area(1.5f,2.5f));
		System.out.println(a.Area(10));
		System.out.println(a.Area(1.6));
		System.out.println(a.Area(1.6,2.6));
	}
}