package Class22;

public class Repl151 {

    static int sum2D(int[][] ar) {
        int sum = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                sum = sum + ar[i][j];
            }

        }

        return sum;
    }


    public static void main(String[] args) {


        int[][] a = {

                {1, 2, 3},

                {4, 5, 6},

                {7, 8, 9}

        };

        System.out.println(sum2D(a));

    }
}