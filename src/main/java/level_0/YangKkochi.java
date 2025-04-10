package level_0;

import java.util.Scanner;

public class YangKkochi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(solution(n, k));

    }
    static int solution (int n, int k) {
        if (n / 10 > 0) {
            k -= n / 10;
        }
        int answer = n * 12000 + k * 2000;
        return answer;
    }
}
