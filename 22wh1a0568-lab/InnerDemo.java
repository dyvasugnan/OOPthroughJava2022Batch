package cseb;

class Outer{
		void outershow() {
			System.out.println("Outer show");
			class Inner{
				void innershow() {
					System.out.println("Inner show");
					}
				}
			Inner in = new Inner();
			in.innershow();
			}
		}

public class InnerDemo {
	public static void main(String[] args) {
		Outer out = new Outer();
		out.outershow();		
	}
}