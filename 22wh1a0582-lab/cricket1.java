public class pensions{
      public static void main(string[] args){
             int test=15,odi=120,ipl=0,india=3;
             if(test>10 && odi==100)
	     {
		system.out.println("pension=rs.50,000");
             }
             if(test>10)
             {
                 system.out.println("pension=rs.25,000");
             }
             if(odi>100)
             {
                  system.out.println("pension=rs.15,000");
             }
             if(india>0)
             {
                   system.out.println("pension=rs.10,000");
             }
             if(india==0 && ipl>0)
             {
                    system.out.println("pension=rs.8,000");
             }
             if(india==0 && ipl==0)
             {
                    system.out.println("pension=rs.7000");
             }
             
      }
}    