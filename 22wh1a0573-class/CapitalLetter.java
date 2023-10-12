import java.util.*;
import java.io.*;
public class CapitalLetter {
	public static void main(String[] args) {
		String s = "hi all, i am saividhya";
		String[] words = s.split(" ");
		for(int i=0;i<words.length;i++) {
			if(words[i]!=" "||words[i]!=",") {
			String afterfirst = words[i].substring(1);
			String first = words[i].substring(0,1);
			first = first.toUpperCase();
			words[i] = first + afterfirst;
	}}
		s = String.join(" ",words);
		System.out.println(s);
}}