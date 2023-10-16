import  java.util.*;
class Bankacc
{
double bal;
Bankacc(double b)
{
bal=b;
}
void contact(double r)
{
Scanner sc=new Scanner(System.in);
String pwd;
System.out.println("enter pwd");
pwd=sc.next();
if (pwd.equals("ashwitha"))
{
Interest in=new Interest(r);
in.calcInter();
}
else
{
System.out.println("not");
}
}
class Interest
{
double rate;
Interest(double r)
{
rate=r;
}
void calcInter()
{
int t=10;
double s=(bal*t*rate/100);
System.out.println("interest"+s);
}
}
}
class Balance
{
public static void  main(String args[])
{
Bankacc b=new Bankacc(1000);
b.contact(6);
}
}
