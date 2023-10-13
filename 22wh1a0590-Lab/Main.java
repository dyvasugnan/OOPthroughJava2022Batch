class Area{
   void area(int l,int b){
      System.out.println("area of rectangle is:" +(l*b));
   }
   void area(int l){
      System.out.println("area of square is:" +(l*l));
   }
   void area(float l,float b){
      System.out.println("area is:" +(l*b));
   }
   void area(int l,float b){
      System.out.println("area is:" +(l*b));
   }
}
class Main{
   public static void main(String[] args){
      Area a = new Area();
         a.area(2,3);
         a.area(2);
         a.area(2.3f,1.2f);
         a.area(2,1.2f);
   }
}
       