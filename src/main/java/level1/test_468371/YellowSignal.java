package level1.test_468371;

import java.util.Scanner;

public class YellowSignal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] signals = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                signals[i][j] = sc.nextInt();
            }
        }

        int answer = solution(signals);

        System.out.println(answer);
    }

    public static int solution(int[][] signals) {
        int answer = 0;
        return answer;
    }
}
