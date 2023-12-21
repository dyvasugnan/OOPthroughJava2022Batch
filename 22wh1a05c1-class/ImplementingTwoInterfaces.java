interface Shapes {
    void shape(int p);
}
interface ShapeTwo{
    void shape2(int l,int b);
}

class Rectangle implements ShapeTwo {
    public void shape2(int l,int b) {
        System.out.println( "Area of Rectangle: "+l * b);
    }
}

class Square implements Shapes {

    public void shape(int s) {
        System.out.println("Area of Square: " + s * s);
    }
}

class Circle implements Shapes {

    public void shape(int r) {
        System.out.println("Area of Circle: " + 3.14 * r * r);
    }
}

class Main {
    public static void main(String[] args) {
        ShapeTwo c = new Rectangle();
        Square s = new Square();
        Circle r = new Circle();
        c.shape2(4,5); 
        s.shape(4);
        r.shape(5);
    }
}
