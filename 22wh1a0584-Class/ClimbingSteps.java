import java.lang.*;
import java.util.*;
class Steps
{
    void stepsClimbing(int n,String space)
    {
        if (n==0)
        {
            System.out.println(space);
        }
        if (n>=1)
        {
            if(!space.isEmpty()){
                space+=" ";
            }
            stepsClimbing(n-1,space+"1");
        }
        if (n>=2)
        {
            if(!space.isEmpty()){
                space+="";
            }
            stepsClimbing(n-2,space+"2");
        }
    }
}
class ClimbingSteps{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       // System.out.print("Enter the number of steps: ");
        int num = scanner.nextInt();
        Steps s=new Steps();
        s.stepsClimbing(num,"");
    }
}
