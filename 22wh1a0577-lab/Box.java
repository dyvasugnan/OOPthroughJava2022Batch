import java.util.*;
   public class Box{
    int height,breadth;
    double width,result;
    void Getdata(){
        Scanner sc = new Scanner(System.in);
        height= sc.nextInt();
        breadth = sc.nextInt();
        width= sc .nextDouble();
    }
    void cal_value(){
        result = height*breadth*width;
    }
    void Display(){
        System.out.println("result:"+result);
    }
    public static void main(String[]arg){
        Box b = new Box();
        b.Getdata();
        b.cal_value();
        b.Display();
    }

}
