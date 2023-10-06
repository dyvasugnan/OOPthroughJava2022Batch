class Box{
	double b,l,h;
	Box(){
		l=10;
		b=5;
		h=6;
	}
	Box(double l, double b, double h){
		this.l=l;
		this.b=b;
		this.h=h;
	}
	double calc(){
		return l*b*h;
	}
}
class Final{
	public static void main(String[] args){
		Box b1 = new Box();
		System.out.println(b1.calc());
		Box b2 = new Box(10,5,2);
		System.out.println(b2.calc());
	}
}
