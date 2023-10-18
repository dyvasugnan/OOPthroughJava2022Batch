class Cricket{
	public static void main(String[] args){
		int for_ipl=0,for_india=1,man_of_the_match=1,test_matches=20,odts=500,amount;
		if(for_india==1){
			if ((test_matches>10)&&(odts>100)){
				amount=50000;
			}
			else if(test_matches>10){
				amount=25000;
			}
			else if(odts>100){
				amount=15000;
			}
			else{
				amount=10000;
			}
		}
		else if(for_ipl==1){
			amount=8000;
		}
		else{
			amount=7000;
		}
		if (man_of_the_match==1){
			amount*=1.25;
		}
		System.out.println("pension amount : "+amount);

	}
}
