package level1.test_340198;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Park {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // mats 입력
        int n = Integer.parseInt(br.readLine());

        int[] mats = new int[n];

        String[] matInput = br.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            mats[i] = Integer.parseInt(matInput[i]);
        }

        // park 크기 입력
        String[] size = br.readLine().split(" ");

        int row = Integer.parseInt(size[0]);
        int col = Integer.parseInt(size[1]);

        // park 입력
        String[][] park = new String[row][col];

        for (int i = 0; i < row; i++) {
            park[i] = br.readLine().split(" ");
        }

        System.out.println(solution(mats, park));
    }

    public static int solution(int[] mats, String[][] park) {

        int row = park.length;
        int col = park[0].length;

        int[][] dp = new int[row][col];

        int maxSize = 0;


        for (int i = 0; i < row; i++) {

            for (int j = 0; j < col; j++) {

                if (!park[i][j].equals("-1")) {
                    continue;
                }

                if (i == 0 || j == 0) {
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = Math.min(
                            Math.min(dp[i - 1][j],
                            dp[i][j - 1]),
                            dp[i - 1][j - 1]
                    ) + 1;
                }

                maxSize = Math.max(maxSize, dp[i][j]);
            }
        }

        int answer = -1;

        for (int mat : mats) {
            if (mat <= maxSize) {
                answer = Math.max(answer, mat);
            }
        }

        return answer;
    }
}
