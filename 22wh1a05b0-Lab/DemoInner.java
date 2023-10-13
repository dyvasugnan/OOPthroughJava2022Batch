package java_225B0_CSEB;

class Outer{
	
	void outerShow() {
		System.out.println("Outer Method");
		
		class Inner{
			void innerShow() {
				System.out.println("Inner method");
			}
		} // End of Inner Class
		Inner in = new Inner();
		in.innerShow();
	}
}



public class DemoInner {
	
	public static void main(String[] args) {
		Outer out = new Outer();
		out.outerShow();
	}
	}
