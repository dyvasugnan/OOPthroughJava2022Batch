public static String capWords(String inp){
	String[] words= inp.split("");
	for(String word: words){
	if(!word.isEmpty()){
		result.append(Character.toUpper(word.charAt(0)))
}
}
return result.toString().trim(0;
}
pubic static void main(String[]args){
	String inp="Helloworld";
	String capStr=capWords(inp);
	System.out.print(capStr);
}