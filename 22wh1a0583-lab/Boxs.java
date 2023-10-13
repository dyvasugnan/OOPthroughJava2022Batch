class Boxs{
	double l,b,h;
	Boxs(double x,double y,double z){
	l=x;
	b=y;
	h=z;
}
double calc(){
  return l*b*h;
}
}
class Demo{
	public static void main(String[] args){
           Boxs b1=new Boxs(2,8,5);
	   Boxs b2=new Boxs(6,5,4);
	   System.out.println(b1.calc());
	   System.out.println(b2.calc());
}
}
