package level_0;

import java.util.Arrays;
import java.util.Scanner;

public class DivisorFinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(Arrays.toString(solution(n)));
    }
    static int[] solution(int n) {
        int[] df = new int[n];
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                df[count] = i;
                count++;
            }
        }

        int[] answer = new int[count];
        System.arraycopy(df, 0, answer, 0, count);

        return answer;
    }
}
