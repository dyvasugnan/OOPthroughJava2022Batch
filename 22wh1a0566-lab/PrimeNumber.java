public class PrimeNumber{
	public static void main(String[] args){
		int a=11,count=0;
		for(int i=2;i<a;i++){
			if(a%i==0){
				count+=1;
			}
		}
		if(count==0){
			System.out.println("IT IS A PRIME NUMBER");
		}
		else{
			System.out.println("IT IS NOT A PRIME NUMBER");
		}
	}
}
 