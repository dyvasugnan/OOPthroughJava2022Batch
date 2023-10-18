import java.util.*;
class test {
        public static void main(String[] args) {
               Scanner scanner = new Scanner(System.in);
               int n=sc.nextInt();
               int i;
               for(i=0;i<=n;i++){
                       int marks=sc.nextInt();
                       System.out.println(marks);
               }
               for(i=0;i<n;i++){
                    if(marks[i]!=0){
                            int c=0;
                             for(j=0;j<n;j++){
                                     if(marks[j]==marks[i]){
                                             c=1;
                                             marks[j]=0;
                                        }
                                   }
                          }
                }
                if(c==1){
                        marks[i]=0;
                }
                int max=marks[0];
                for(i=0;i<n;i++){
                        if(marks[max]>max){
                              max=marks[i];
                        }
                }
                System.out.println(max);
       }
}

       
