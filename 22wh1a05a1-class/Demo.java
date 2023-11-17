package math;

public interface Find
{
int A = 2;
void calculate();//by default method is public and abstract
}
class Cube implements Find{
public void calculate(){
int C;
C = Find.A * Find.A * Find.A;
System.out.println("The cube is :",+C);
}
}
class Square implements Find
{
public void calculate()
{
int S;
S = Find.A * Find.A;
System.out.println("The square is",+S);
}
}
class square_Root implements Find
{
public void calculate()
{
int S1;
S1 = Math.sqrt(A);
System.out.println("the square root is",+S1);
}
}
import java.math.*;
class Demo
{
public static void main(String args[ ])
{
Cube obj = new Cube();
obj.calculate();
Square obj1 = new Square();
obj1.calculate();
square_Root obj3 = new square_Root();
obj3.calculate();
}
}

