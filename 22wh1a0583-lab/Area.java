class Area{	
	void area(int a,int b){
	  System.out.println("area is:"+(a*b));
	}
	void area(float a,float b){
	  System.out.println("area is:"+(a*b));
	}
	void area(int a,float b){
	  System.out.println("area is:"+(a*b));	
	}
}
class Demo{
	public static void main(String[]args){
	 Area a1=new Area();
	 a1.area(4,6);
	 a1.area(24.6f,45.8f);
	 a1.area(8,9.7f);
}
}	