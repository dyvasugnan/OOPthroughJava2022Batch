import java.util.*;
class Box{
	double length,breadth,height;
	Box(){
		length=34;
		breadth=56;
		height=67;
		
	}
	
	Box(double l,double b,double h){
                //double length,breadth,height;
		length=l;
		breadth=b;
		height=h;
		
	}
	double calcVol(){
		return length*breadth*height;
		//System.out.println("Volume : "+volume);
	}	
}
class VolumeCalc{
	public static void main(String[] args){
		Box b1=new Box();
		b1.calcVol();
                Box b2=new Box(23.4,2.1,2.4);
		b2.calcVol();
		System.out.println(b1.calcVol());
		System.out.println(b2.calcVol());
}
}
