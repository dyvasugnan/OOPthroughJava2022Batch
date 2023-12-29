
	class Outer{
		class Inner{
			void show() {
				System.out.println("Inner Class");
			}
		}
	}

	public class InnerDemo {
			
		public static void main(String[] args) {
			Outer.Inner out = new Outer().new Inner();
			out.show();		
		}
	}




