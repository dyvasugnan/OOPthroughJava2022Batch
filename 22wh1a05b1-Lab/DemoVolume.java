import java.util.*;

class Box {
	int length = 5;
	int breadth = 10;
	int height = 20;
	Box() {
		System.out.println("The Volume of the Box is: "+(length*breadth*height));
	}

	Box(int l , int b , int h) {
		length = l;
		breadth = b;
		height = h;
		int Volume;
		Volume = length*breadth*height;
		System.out.println("The Volume of the Box is: "+Volume);
	}
}

class DemoVolume {
	public static void main(String[] args) {
		Box b1 = new Box();
		Box b2 = new Box(2,3,4);

	}
}