package level_0;

import java.util.Scanner;

public class PizzaDivider3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int silce = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(solution(silce, n));
    }
    static int solution(int slice, int n) {
        int answer = n / slice;
        if (n % slice != 0) {
            answer++;
        }
        return answer;
    }
}
