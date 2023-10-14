package cseb;





class Outer{

	void outer_show() {

		System.out.println("Outer Class");

		

		class Inner{

			void inner_show() {

				System.out.println("Inner Class");	

			    

			}

			

	    }

		Inner in=new Inner();

		in.inner_show();

	}

}



public class Inner_demo{

	public static void main(String[] args) {

		Outer out=new Outer();

		out.outer_show();

		

	}

}