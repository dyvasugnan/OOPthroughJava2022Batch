package CSEB5A9;

class Outer{
	void outerShow() {
		System.out.println("outer method");
		class Inner{
			void innerShow() {
				System.out.println("inner method");
				
			}
		
		}
		Inner in=new Inner();
		in.innerShow();
	}
}



public class InnerDemo {

	public static void main(String[] args) {
		Outer out=new Outer();
		out.outerShow();
		
	}

}
 
