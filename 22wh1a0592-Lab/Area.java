class Area{
       void area(int x,int y){
                System.out.println("area is"+(x*y));
       }
       void area(float x,float y){
                System.out.print("area is"+(x*y));
       }
}
class Display{
       public static void main(String[] args){
                Area a=new Area();
                a.area(2,3);
                a.area(12f,3f);
                a.area(3,3f);
 }
}