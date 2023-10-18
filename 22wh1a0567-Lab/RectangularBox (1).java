import java.util.*;
class Box{
	double l,b,h;
	Box(){
		l=25.1;
		b=28.5;
		h=30.3;
	}
	Box(double l,double b){
		this.l=l;
		this.b=b;
		h=30.3;
	}
	Box(double l){
		this.l=l;
		b=28.5;
		h=30.3;
	}
	void calculateVolume(){
		System.out.println("Volume of the box : "+(l*b*h));
	}
}

public class RectangularBox{
	public static void main(String args[]){
		Box b1=new Box();
		b1.calculateVolume();
		Box b2=new Box(25.1,28.5);
		b2.calculateVolume();
		Box b3=new Box(10.5);
		b3.calculateVolume();
	}
}
