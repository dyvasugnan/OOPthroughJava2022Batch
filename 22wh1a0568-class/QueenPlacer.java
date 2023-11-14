package LearningJava;

public class QueenPlacer {

	public static void main(String[] args) {
		int[][] board = new int[4][4];
		for(int i = 0; i < 4;i++) {
			for(int j = 0; j<4;j++) {
				if (j-i == 2 || i-j == 2)
					System.out.print("Q\t");
				else
					System.out.print("1\t");
			}
			System.out.println();
		}
	}

}
