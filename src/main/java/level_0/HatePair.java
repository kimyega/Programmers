package level_0;

import java.util.Arrays;
import java.util.Scanner;

public class HatePair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Arrays.toString(solution(n)));
    }
    static int[] solution(int n) {
        int count = n % 2 == 0 ? n / 2 : n / 2 + 1;
        int idex = 0;
        int[] answer = new int[count];

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                answer[idex] = i;
                idex++;
            }
        }
        return answer;
    }
}
