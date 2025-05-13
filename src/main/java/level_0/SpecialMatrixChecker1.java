package level_0;

import java.util.Arrays;
import java.util.Scanner;

public class SpecialMatrixChecker1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(Arrays.toString(solution(n)));
    }
    static int[][] solution(int n) {
        int[][] answer = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                answer[i][j] = i == j ? 1 : 0;
            }
        }

        return answer;
    }
}
