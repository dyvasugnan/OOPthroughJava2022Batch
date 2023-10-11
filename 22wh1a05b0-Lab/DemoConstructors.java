import java.util.*;

class Box{
	int length=25;
	int bredth=10;
	int height=50;

	Box(){
		System.out.println("Volume using Default Constructor: "+(length*bredth*height));
	}
	
	Box(int len,int wid,int hei){
	length = len;
	bredth = wid;
	height = hei;
		System.out.println("Volume using Parametrised Constructor: "+(length*bredth*height));
	}

}

class DemoConstructors{
	public static void main (String[] args){
		Box b1 = new Box();
		Box b2 = new Box(25,10,50);

	}
}