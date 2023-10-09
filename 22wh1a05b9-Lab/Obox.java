class Box{
	double w,b,h;
		Box(){
			w=10;
			h=39;
			b=67;
	}
	double cal(){
		return w*h*b;
	}
}
public class Obox{
	public static void main(String[]args){
		Box b1=new Box();
			System.out.println(b1.cal());
	}
}