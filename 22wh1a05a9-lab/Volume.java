class Box{
	double length,height,width;
	Box()
	{
		length=2.4;
		height=3.5;
		width=5.4;
	}
	double volume()
	{
		return(length*height*width);
	}
}
class Volume{
	public static void main(String[] args){
		Box b=new Box();
		System.out.println(b.volume());
	}
}