package level_0;

import java.util.Scanner;

public class PairSetCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
    }
    static int solution(int n) {
        int answer = 0;
        for (int i = 0; i < n; i++) {
            if (n % (i + 1) == 0) {
                answer++;
            }
        }
        return answer;
    }
}
