class Box{
	float l,b,h;
	Box(){
		l = 20;
		b = 30;
		h = 50;
		System.out.println(l*b*h);
	}
	Box(int l,int b,int h){
		System.out.println("sum is:"+ (l+b+h));
	}
}
public class Default{
	public static void main(String[]args){
		Box s1 = new Box();
		Box s2 = new Box(2,3,4);
	}
}
