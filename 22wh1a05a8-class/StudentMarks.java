import java.util.Scanner;
class StudentMarks{
    public static void main(String[] args) {
        System.out.println("Enter the no.of subjects");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float tm = 0;
        float tap = 0;
        float ap;
        for(int i=0;i<n;i++){
            float m = sc.nextFloat();
            tm = tm + m;
            tap = tap + (m/100);
        }
        ap = (tap/n);
        System.out.println("The total marks of the student are "+tm);
        System.out.println("The average percentage marks of the student is "+ap);
        float x = ap*100;
        if(x>90 && x<=100)
            System.out.println("The grade of the student is O");
        else if(x>80 && x<=90)
            System.out.println("The grade of the student is A+");
        else if(x>70 && x<=80)
            System.out.println("The grade of the student is A");
        else if(x>60 && x<=70)
            System.out.println("The grade of the student is B+");
        else if(x>50 && x<=60)
            System.out.println("The grade of the student is B");
        else if(x>40 && x<=50)
            System.out.println("The grade of the student is C");
        else
            System.out.println("The grade of the student is F");
    }
}
