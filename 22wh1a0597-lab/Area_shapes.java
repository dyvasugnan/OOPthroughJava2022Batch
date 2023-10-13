class Area{
      Area(int length , int width){
           System.out.println("The area of the rectangle : " + length * width);
      }

      Area( int side ){
          System.out.println("The area of square :"  + (side * side));
      }
 
      Area( float radius){
         System.out.println("The area of circle is : " + (3.14 * radius * radius));
      }
}
class Area_shapes{
     public static void main( String[] args ){
           Area a1 = new Area( 5 ,4 );
           Area a2 = new Area( 5 );
           Area a3 = new Area ( 4f );
     }
}
            