package LearningJava;

public class Set0Matrix {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 1, 1, 1},
                {1, 1, 0, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1}
        };

        int M = mat.length;
        int N = mat[0].length;

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (mat[i][j] == 0) {
                    for (int k = 0; k < N; k++) {
                        if (mat[i][k] != 0) {
                            mat[i][k] = -1;
                        }
                    }
                    for (int k = 0; k < M; k++) {
                        if (mat[k][j] != 0) {
                            mat[k][j] = -1;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (mat[i][j] == -1) {
                    mat[i][j] = 0;
                }
            }
        }


        System.out.println("The Zeroes Set matrix");
        for(int i = 0;i<M;i++) {
			for(int j = 0;j<N;j++)
				System.out.print(mat[i][j]+ " ");
			System.out.print("\n");
		}
    }
}

