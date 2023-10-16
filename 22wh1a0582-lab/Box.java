class Box{
      double l,b,h;
      Box(){
      l=10;
      b=10;
      h=10;
}
double calc(){
   return l*b*h;
}
}
class Demo{
      public static void main(String[] args){
          Box b1=new Box();
          Box b2=new Box();
          System.out.println(b1.calc());
          System.out.println(b2.calc());

}}
