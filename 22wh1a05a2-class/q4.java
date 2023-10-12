import java.lang.*;
class Test
{
public static int count(int n)
{
int[] ways = new int[n+1];
ways[0]=1;
ways[1]=1;
for(int i=2;i<=n;i++){
ways[i]=ways[i-1]+ways[i-2];
}
return ways[n];
}
public static void main(String []args)
{
int n=3;
int ways=count(n);
System.out.println("no.of ways="+ways);
}
}