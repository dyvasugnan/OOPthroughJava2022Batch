public class Test {
    public static void main(String[] args) {
        int marks[] = {7, 7, 5, 6, 7, 8}; 
	int maxMarks = -1;
        boolean Qualified_students = false;
	for (int i = 0; i < marks.length; i++) 
	{
		boolean disqualified = false;
		for (int j = 0; j < marks.length; j++) 
		{
                	if (marks[i] == marks[j] && i != j) 
			{
                    		disqualified = true;
                    		break;
                	}
        	}
		if (!disqualified) 
		{
                	Qualified_students = true;
                	maxMarks = Math.max(maxMarks, marks[i]);
           	}
        }
	if (Qualified_students)
	{
            System.out.println("The marks of the topper in the class from the qualified students: " + maxMarks);
        } 
	else 
	{
            System.out.println("No qualified students found.");
        }
    }
}