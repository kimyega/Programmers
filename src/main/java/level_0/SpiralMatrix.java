package level_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SpiralMatrix {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        System.out.println(Arrays.deepToString(solution(n)));
    }

    public static int[][] solution(int n) {
        int[][] answer = new int[n][n];

        for (int i = 1; i <= n * n; i++) {

        }
        return answer;
    }
}
