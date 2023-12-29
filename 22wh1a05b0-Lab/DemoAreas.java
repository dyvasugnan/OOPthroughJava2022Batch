import java.util.*;

class Areas {
		
	void ComputeArea (int l, int b) {
		System.out.println("Area of rectangle = "+(l*b));
	}
	
	void ComputeArea (float B, float h) {
		System.out.println("Area of triangle = "+(0.5*B*h));
	}
	
	void ComputeArea (double r) {
		System.out.println("Area of circle = "+(3.14*r*r));
	}
}

class DemoAreas {
	public static void main(String[] args) {
	Areas a1 = new Areas();
	a1.ComputeArea(6,8);
	Areas a2 = new Areas();
	a2.ComputeArea(6.8f,3.4f);
	Areas a3 = new Areas();
	a3.ComputeArea(7.2);
	}
}
	