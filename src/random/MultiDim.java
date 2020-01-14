package random;

public class MultiDim {

    public static void main(String[] args) {

        int[][] a = new int[3][2];

        int[][] s1 = {
                {1, 3, 4},
                {1, 5, 6}
        };

        int[][] s2 = {
                {4, 5, 6},
                {10, 11, 12}
        };

        int[][] sum = new int[2][3];

        System.out.println(s1.length);

        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s1[i].length; j++) {
                sum[i][j] = s1[i][j] + s2[i][j];
                System.out.print(sum[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
}
