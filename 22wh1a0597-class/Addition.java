package hai;

public class Addition {
    private double a, b;

    public Addition(double x, double y) {
        a = x;
        b = y;
    }

    public void add() {
        System.out.println(a + b);
    }

    public static class Use {
        public static void main(String[] args) {
            Addition obj = new Addition(5, 4);
            obj.add();
        }
    }
}
