
public class CapitaliseLetter {

	public static void main(String[] args) {
		String s = "heyy hello welcome, to the world of eclipse";
		String[] words = s.split(" ");
		for(int i=0;i<words.length;i++) {
			if(words[i]!=" "||words[i]!=",") {
			String first = words[i].substring(0,1);
			String afterfirst = words[i].substring(1);
			first = first.toUpperCase();
			words[i] = first + afterfirst;
	}}
		s = String.join(" ",words);
		System.out.println(s);
}}
