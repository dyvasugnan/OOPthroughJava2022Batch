public class MultiplicationTable{
	public static void main(String[] args){
		scanner sc=new Scanner(System.in);
		System.out.println("Enter which number's table :");
		int x=sc.nextInt();
		System.out.println("Enter how many terms : ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			System.out.println(x+"*"+i"="+x*i);
		}
	}
}