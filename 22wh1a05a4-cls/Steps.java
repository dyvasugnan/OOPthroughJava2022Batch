import java.lang.*;
class Steps
{
public static int count(int n)
{
int[] ways = new int[n+1];
no_of_ways[0]=1;
no_of_ways[1]=1;
for(int i=2;i<=n;i++){
no_of_ways[i]=no_of_ways[i-1]+no_of_ways[i-2];
}
return no_of_ways[n];
}
public static void main(String []args)
{
int n=3;
int no_of_ways=count(n);
System.out.println("no.of ways="+no_of_ways);
}
}