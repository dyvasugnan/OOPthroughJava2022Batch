class Box{
    double l,b,h;
    Box(double x,double y,double z){
    l=x;
    b=y;
    h=z;
}
double cal_Vol(){
    return l*b*h;
}
}
class Volume{
  public static void main(String[] args){
    Box b1 = new Box(2,3,5);
    Box b2 = new Box(6,5,3);
    System.out.println(b1.cal_Vol());
    System.out.println(b2.cal_Vol());
 }
}