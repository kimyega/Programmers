package level_0;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(Arrays.toString(solution(n, k)));
    }
    static int[] solution(int n, int k) {
        int[] answer = new int[n / k];
        int idx = 0;

        for (int i = 1; i <= n; i++) {
            if (i % k == 0) {
                answer[idx] = i;
                idx++;
            }
        }

        return answer;
    }
}
