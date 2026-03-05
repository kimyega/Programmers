package level_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ScoreRanking {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // 학생 수
        int[][] score = new int[n][2];

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            score[i][0] = Integer.parseInt(input[0]);
            score[i][1] = Integer.parseInt(input[1]);
        }

        int[] result = solution(score);

        System.out.println(Arrays.toString(result));
    }

    public static int[] solution(int[][] score) {
        int n = score.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] = 1;

            for (int[] ints : score) {
                if (score[i][0] + score[i][1] < ints[0] + ints[1]) {
                    result[i]++;
                }
            }
        }

        return result;
    }
}
