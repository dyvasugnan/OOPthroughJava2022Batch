package akshitha_c7;

class Outer{
	void outershow() {
		  System.out.println("Outer method");
		  class Inner{
			  void innershow() {
				  System.out.println("Inner method");
			  }
		  }//end of Inner class
		  Inner in=new Inner();
		  in.innershow();
	   
	 }
}

public class innerDemo {

	public static void main(String[] args) {
		
		Outer out=new Outer();
		out.outershow();
		 
		

	}

}
