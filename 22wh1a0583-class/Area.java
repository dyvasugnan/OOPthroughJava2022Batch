class Area{
	void area(int l,int b){
		System.out.println("The area of the rectangle is "+(l*b));
	}
	void area(float b,float h){
		System.out.println("The area of the rectangle is "+((b*h)/2));
	}
	void area(double r){
		System.out.println("The area of the circle is "+(3.14*r*r));
	}
}
public class AreaCalc{
	public static void main(String[] args){
		Area a = new Area();
        	a.area(1,2);
		a.area(1.2f,2.3f);
		a.area(2.56);
	}
}