package level_0;

import java.util.Scanner;

public class PizzaDivider1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
    }
    static int solution(int n) {
        int answer = n / 7;
        if (n % 7 != 0) {
             answer++;
        }
        return answer;
    }
}
