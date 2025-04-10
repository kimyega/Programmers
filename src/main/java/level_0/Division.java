package level_0;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(solution(num1, num2));

    }
    static int solution (int num1, int num2) {
        int answer = num1 / num2;

        return answer;
    }
}
