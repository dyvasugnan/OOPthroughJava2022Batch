//swap without using third variable
class Swap{
static void swap(int m,int n)
{
m = m-n;
n = m+n;
m = n-m;
System.out.println(m);
System.out.println(n);
}
}
class Swaps{
public static void main(String[] args){
int m = 4;
int n = 5;
swap(m,n);
  }
}



 