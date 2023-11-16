import java.util.*;
class Oned{
    double s;
    int o[];
    Oned(double s){
        this.s=s;
        o=new int[(int) s];
    }
    void Input(){
        System.out.println("enter elements of one d array-");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<s;i++){
            o[i]=sc.nextInt();
        }
    }
    void Display(){
        for(int i=0;i<s;i++){
            System.out.print(o[i]);
        }
        System.out.println();
    }
}
class Twod extends Oned{
    double c;
    int t[];
    Twod(double c){
        super(c);
        this.c=c;
        t=new int[(int) c];
    }
    void Input1(){
        System.out.println("enter elements for two d array-");
        Scanner sc=new Scanner(System.in);
        for(int j=0;j<c;j++){
            t[j]=sc.nextInt();
        }
    }
    void Display1(){
        for(int k=0;k<c;k++){
            System.out.print(t[k]);
        }
    }
}

class Main{
    public static void main(String[] args){
        Oned o1=new Oned(3);
        Twod t1=new Twod(3);
        o1.Input();
        t1.Input1();
        o1.Display();
        t1.Display1();
    }
}













