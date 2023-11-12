package hai;

public class Alternate {

	public static void main(String[] args) {
        String name = "manvitha";
        String names = "shelshii";
        
        int i;
        String Final = " ";
        
        for( i = 0 ; i < name.length(); i++  ) {
        	if ( (i % 2) == 0 ) {
        		 Final += name.charAt(i);
        		 
        	}
        	else {
                	if ( (i % 2) != 0) {
                		Final += names.charAt(i);
                		
                	}
                }
        }
        System.out.print("The new string formed is " + Final);

	}

        
}

