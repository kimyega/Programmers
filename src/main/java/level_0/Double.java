package level_0;

import java.util.Scanner;

public class Double {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(solution(num1, num2));

    }
    static int solution (int num1, int num2) {
        double num3 = (double) num1 / num2 * 1000;
        int answer = (int)num3;

        return answer;
    }
}
