package level_0;

import java.util.Scanner;

public class OperationComparator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(solution(a, b));
    }
    static int solution(int a, int b) {
        int n = Integer.parseInt(a + "" + b);
        return Math.max(n, 2 * a * b);
    }
}
