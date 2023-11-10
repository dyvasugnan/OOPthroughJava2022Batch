interface Calculation{
    void calc(int x);
}

class Cube implements Calculation{
    public void calc(int x){
        System.out.println("Cube of a number  :"+(x*x*x) );
    }
}
class Square implements Calculation{
    public void calc(int x){
        System.out.println("Square of a number  :"+ Math.pow(x,2) );
    }
}
class Sqrt implements Calculation{
    public void calc(int x){
        System.out.println("Square root of a number  :"+ Math.sqrt(x));
    }
}

class Interface{
    public static void main(String args[]){
      
        Cube c=new Cube();
        c.calc(4);
        Square s=new Square();
        s.calc(4);
        Sqrt r=new Sqrt();
        r.calc(4);
    }
}