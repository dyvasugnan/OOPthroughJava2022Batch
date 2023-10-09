class Box{
	double length,breadth,width;
	Box(double a,double b,double c)
	{
		length=a;
		breadth=b;
		width=c;
	}
	double volume()
	{
		return (length*breadth*width);
	}
}
class BoxVolume{
	public static void main(String[] args){
		Box b1=new Box(1.2,2.3,3.5);
		Box b2=new Box(10,20,10);
		System.out.println(b1.volume());
		System.out.println(b2.volume());
	}
} 