package level_0;

import java.util.Scanner;

public class DiceGame2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(solution(a, b, c));
    }
    static int solution(int a, int b, int c) {
        int answer = 0;

        boolean eq = a == b || b == c || c == a;
        boolean alleq = a == b && b == c;

        answer = alleq ? score(a, b, c, 3) : eq ? score(a, b, c, 2): score(a, b, c, 1);

        return answer;
    }
    static int score(int a, int b, int c, int n) {
        int res = 1;

        for (int i = 1; i <= n; i++) {
            res *= power(a, i) + power(b, i) + power(c, i);
        }
        return res;
    }
    static int power(int a, int n) {
        return (int) Math.pow(a, n);
    }
}
