import java.util.*;
class copy{
	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
		System.out.println("enter no of students:");
		int n = obj.nextInt();
		int marks[] = new int[10];
		System.out.println("enter the marks of student:");
		for (int i = 0; i < n;i++){
			marks[i] = obj.nextInt();
		}
		int uniqueCount = 0;
        		for (int i = 0; i < n; i++) {
           			 boolean isDuplicate = false;
            			for (int j = 0; j < i; j++) {
               				 if (marks[i] == marks[j]) {
                   				isDuplicate = true;
                    				break;
               				 }
            			}
            			if (!isDuplicate) {
                				marks[uniqueCount] = marks[i];
               	 			uniqueCount++;
            			}
       		 }

       		 if (uniqueCount == 0) {
            			System.out.println("-1");
        		} 
		else {
            			int max = marks[0];
            			for (int i = 1; i < uniqueCount; i++) {
                				if (marks[i] > max) {
                    				max = marks[i];
                				}
           			 }
           		 System.out.println("The maximum unique mark is: " + max);
        		}
   	 }
}