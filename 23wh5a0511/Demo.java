package cseb;
class outer
{
	
	
		void show()
		{
			System.out.println("in outer class");
			
			class inner{
				void show()
				{
					System.out.println("in inner class");
				}
			}inner in = new inner();
			in.show();
				
			
		}	
			
	}



public class Demo 
{
		public static void main(String[]args)
		{
			outer out = new outer();
			out.show();
			
		}
		// TODO Auto-generated constructor stub
	}




