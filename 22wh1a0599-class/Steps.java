class Steps {
	public static int number(int n){
		int[] permutations = new int[n+1];
		permutations[0]=1;
		permutations[1]=1;
		for(int i=0;i<=n;i++)
		{
			permutations[i]=permutations[i-1]+permutations[i-2];
		}
		return permutations[n];
	}
	public static void main(String[] args){
		int n=3;
		int permutations=number(n);
		System.out.println("no.of ways="+permutations);
	}
}
		