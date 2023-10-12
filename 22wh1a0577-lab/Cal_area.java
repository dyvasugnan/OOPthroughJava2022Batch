import java.util.*;
import java.lang.*;
class Cal_area{
    void area(double theight,double tbase)
    {
        System.out.println("Area of triangle:"+(0.5*tbase*theight));
    }
    void area(int rheight, int rbreadth)
    {
        System.out.println("Area of rectangle:"+(rbreadth*rheight));
    }
    void area(double cradius)
    {
        System.out.println("Area of circle:"+(3.14*cradius*cradius));
    }
}
class Plot{
    public static void main(String[ ] args){

        Cal_area s=new Cal_area();
        s.area(5.3,8.4);
        s.area(5,8);
        s.area(4.6);
    }
}
