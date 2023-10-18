  class Box{
     double w,h,b;
                   Box(){
                   w=10;
                   h=10;
                   b=10;
      }
     Box(double w,double b,double h){
              this.w=w;
              this.h=h;
              this.b=b;
       }
         double cal_Vol(){
              return w*h*b;
      }
}
class Demo{
       public static void main(String[] args){
            Box  b1=new Box();
            System.out.println(b1.cal_Vol());
            Box b2=new Box(10,4,2);
            System.out.println(b2.cal_Vol());
        }
}