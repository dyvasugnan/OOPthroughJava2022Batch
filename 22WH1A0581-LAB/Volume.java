class Box{
	double l,b,h;
	Box(double x,double y,double z){
	l=x;
	b=y;
	h=z;
}
double vol(){
	return l*b*h;
}
}
class Volume{
	public static void main(String[] args){
		Box b1=new Box(2,3,4);
		Box b2=new Box(3,4,5);
		System.out.println(b1.vol());
		System.out.println(b2.vol());
}
}







