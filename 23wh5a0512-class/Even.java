import java.util.*;
class Even extends Thread
{
   int x;
   public Even(int x)
    {
	this.x=x;
	}
   public void run()
   {
	System.out.println("number"+x+"square"+x*x);}

   }
class Odd extends Thread
{
	int x;
public Odd(int x)
   {
	this.x=x;
	}
ublic void run()
   {
	System.out.println("number"+x+"cube"+x*x*x);
	}
}
class RandomThread extends Thread{
	int num;
	public void run()
	{
		Random rand=new Random(0);
		try
		{
			for(int i=0;i<=5;i++)
			{
				num=rand.nextInt(100);
				System.out.println("Main thread generated number"+rand);
				if(num%2==0)
				{
					Thread t1=new Thread(new Even(num));
					t1.start();
				}
				else
				{
					Thread t2=new Thread(new Odd(num));
					t2.start();
				}
				Thread.sleep(1);
			}
		}
	catch(Exception e)
		{

		}

}
}
class Demo1
{
	public static void main(String[] args)
	{
		RandomThread r=new RandomThread();
                                         r.start();
	}
}