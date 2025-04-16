package level_0;

import java.util.Scanner;

public class Flag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean flag = sc.nextBoolean();

        System.out.println(solution(a, b, flag));
    }
    static int solution(int a, int b, boolean flag) {
        int answer = 0;
        return answer = flag ? a + b: a - b;
    }
}
