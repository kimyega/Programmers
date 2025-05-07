package level_0;

import java.util.Scanner;

public class PairOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(solution(n));
    }
    static int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if (n % 2 == 1) {
                if (i % 2 == 1) {
                    answer += i;
                }
            } else {
                if (i % 2 == 0) {
                    answer += i * i;
                }
            }
        }
        return answer;
    }
}
