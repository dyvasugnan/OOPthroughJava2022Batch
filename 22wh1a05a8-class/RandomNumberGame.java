import java.util.Scanner;
public class RandomNumberGame{
	public static void main(String args[])
	{
	    int win = 0;
	    System.out.println("Select any of the following options");
	    System.out.println("1 : Play the game");
	    System.out.println("2 : Show the score");
	    System.out.println("3 : End the game");
	    Scanner sc = new Scanner(System.in);
	    int ch = sc.nextInt();
	    int ran = (int) Math.round(Math.random() * (10));
	    switch (ch) {
          case 1:
            System.out.println("You have only three choices to guess the number");
		    for(int i=0;i<3;i++){
		        System.out.println("Enter a number");
		        int n = sc.nextInt();
		        if(n==ran){
		            System.out.println("You guessed it right!!!");
		            win++;
		            break;
		        }
		        else
		            System.out.println("You failed to guess");
		    }
		    System.out.println("The number is "+ran);
            break;
          case 2:
            System.out.println("Your score is "+(win*10));
            break;
          case 3:
            System.out.println("ENDING THE GAME!");
            break;
        }
	}
}
