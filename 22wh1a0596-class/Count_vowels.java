import java.util.*;
class Count{
    void count_vowels(String s){
        int count = 0;
        for(int i = 0;i< s.length();i++){
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                count++;
            }
        }
        System.out.println(count);
    }
}
class Demo{
    public static void main(String[] args){
        Count c = new Count();
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the string");
        String str = obj.next();
        c.count_vowels(str);
    }
}