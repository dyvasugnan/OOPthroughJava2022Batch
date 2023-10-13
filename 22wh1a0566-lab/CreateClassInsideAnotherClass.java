package java_third_lab;

class Outer{
		void show() {
			//System.out.println("Inner Class");
			class Inner{
				void proove() {
					System.out.println("This is inside show() method");
				}
			}
			Inner in=new Inner();
			in.proove();
		}
	
}

public class CreateClassInsideAnotherClass {
	public static void main(String args[]) {
		Outer out=new Outer();
		out.show();
	}
}