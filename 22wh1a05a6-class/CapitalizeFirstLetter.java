public class CapitalizeFirstLetter {
    public static void main(String[] args) {
        String s = "welcome to bvrith college";
        System.out.println(s);
        String c = capitalizeFirstLetter(s);
        System.out.println(c);
    }
    public static String capitalizeFirstLetter(String s1) {
        if (s1 == null) {
            return s1;
        }
        char fChar = Character.toUpperCase(s1.charAt(0));
        return fChar + s1.substring(1);
    }
}
