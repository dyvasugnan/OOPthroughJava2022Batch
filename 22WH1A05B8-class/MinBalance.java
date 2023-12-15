package prathibha5b8;
import java.util.Scanner;

class cl extends RuntimeException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	cl(String s) {
        super(s);
    }
}

public class MinBalance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] name = new String[3];
        int[] id = new int[3];
        float[] bal = new float[3];
        try {
            for (int i = 0; i < 3; i++) {
                name[i] = sc.next();
                id[i] = sc.nextInt();
                bal[i] = sc.nextFloat();
                if (bal[i] < 1000) {
                    cl mb = new cl("Balance is less than 1000");
                    throw mb;
                }
            }
            for (int i = 0; i < 3; i++) {
                System.out.println(name[i] + "\t" + id[i] + "\t" + bal[i] + "\n");
            }
        } catch (cl mb) {
            mb.printStackTrace();
        }
    }
}
