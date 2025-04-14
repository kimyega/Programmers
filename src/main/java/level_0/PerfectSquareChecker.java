package level_0;

import java.util.Scanner;

public class PerfectSquareChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(solution(n));
    }
    static int solution(int n) {
        int answer = 2;
        for (int i = 1; i <= n; i++) {
            if (n == Math.pow(i + 1, 2)) {
                answer = 1;
            }
        }
        return answer;
    }
}
