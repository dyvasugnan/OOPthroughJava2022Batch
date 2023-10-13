public class Firstchar {
   public static void main(String[] args) {
      String s = "Welcome to bvrith college";
      char c[] = s.toCharArray();
      System.out.println("str:");
      for (int i=0; i < c.length; i++) {
         if(c[i] != ' ' && (i == 0 || c[i-1] == ' ')) {
            System.out.print(c[i]);
         }
      }
   }
}