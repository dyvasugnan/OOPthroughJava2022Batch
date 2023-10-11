class Area{
	void area(int a,int b){
		System.out.println("area of rectangle is" + (a*b));
	}
	void area(float b,float h){
		System.out.println("area of triangle is" + ((b *h)/2));
	}
	void area(float r){
		System.out.println("area of circle is" + (3.14 * r* r));
	}
}
public class Areas{
	public static void main(String[]args){
		Area a = new Area();
		a.area(2,3);
		a.area(3.1f,2.3f);
		a.area(2.1f);
	}
}