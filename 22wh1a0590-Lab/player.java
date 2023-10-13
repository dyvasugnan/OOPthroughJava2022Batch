public class player{
	public static void main(String[]args){
        	int test=15,ODI=100,IPL=0,INDIA=4;
                if(test>10 && ODI<=100)
                {
                 	System.out.print("Recieves Rs.50,000");
                }
                else if(test>10)
                {
                	System.out.print("Recieves Rs.25,000");
                }
                else if(ODI>100)
                {
                	System.out.print("Recieves Rs.15,000");
                }
                else if(INDIA>0)
                {
                	System.out.print("Recieves Rs.10,000");
                }
                else if(INDIA==0 && IPL>=0)
                {
                	System.out.print("Recieves Rs.8,000");
                }
                else 
                {
                	System.out.print("Recieves Rs.7,000");

                }
        
	}
} 