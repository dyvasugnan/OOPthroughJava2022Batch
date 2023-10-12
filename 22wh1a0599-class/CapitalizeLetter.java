class CapitalizeLetter{
	public static void main(String[] args){
		String str = "welcome to java";	
		
		String s1 = str.substring(0,1);
		String s2 = s1.toUpperCase();
		String a1 = str.substring(1,8);

		String s3 = str.substring(8,9);
		String s4 = s3.toUpperCase();
		String a2 = str.substring(9,11);
		
		String s5 = str.substring(11,12);
		String s6 = s5.toUpperCase();
		String a3 = str.substring(12);
		
		System.out.println("Actual string:");
		System.out.println(str);
		
		System.out.println("capitalized sentence :");
		System.out.println(s2+a1+s4+a2+s6+a3);

	}
}