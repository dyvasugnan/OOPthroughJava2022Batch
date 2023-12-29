class Out{
	void outShow() {
		
		System.out.println("Outer Method");
		
		class In{
			void inShow() {
				System.out.println("Inner Method");
			}
		}
		In i = new In();
		i.inShow();
	}
}

public class InDemo {
	
	public static void main(String[] args) {
		
		Out o = new Out();
		o.outShow();
		
	}
}
