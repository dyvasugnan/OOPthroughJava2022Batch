package hai;

interface Test1 {
    void method_1();
    void method_2();
}

class Test2 implements Test1 {
    public void method_1() {
        System.out.println("This is method 1");
    }
    public void method_2() {
        System.out.println("This is method 2");
    }
}

public class Interface {
    public static void main(String[] args) {
        
        Test2 obj = new Test2();

        obj.method_1();
        obj.method_2();
    }
}
