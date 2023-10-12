package LearningJava;

public class GetLetterString {

	public static void main(String[] args) {
		String s = "Welcome, to Bvrit Hyderabad College of Engineering For Women";
		String[] words = s.split(" ");
		for(int i=0;i<words.length;i++) {
			if(words[i]!=" " || words[i]!=",") {
				char letter = words[i].charAt(0);
				System.out.print(letter);
			}
		}
	}
}
