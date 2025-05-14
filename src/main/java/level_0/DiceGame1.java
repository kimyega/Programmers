package level_0;

import java.util.Scanner;

public class DiceGame1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(solution(a, b));
    }
    static int solution(int a, int b) {
        int answer = 0;

        boolean bothOdd = a % 2 != 0 && b % 2 != 0;
        boolean oneOdd = a % 2 != 0 || b % 2 != 0;

        if (bothOdd) {
            answer = a * a + b * b;
        } else if (oneOdd) {
            answer = 2 * (a + b);
        } else {
            answer = Math.abs(a - b);
        }

        return answer;
    }
}
