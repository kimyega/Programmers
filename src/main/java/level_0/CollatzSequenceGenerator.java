package level_0;

import java.util.Arrays;
import java.util.Scanner;

public class CollatzSequenceGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(Arrays.toString(solution(n)));
    }
    static int[] solution(int n) {
        int count = 0, x = n;

        String s = x + " ";

        while (x != 1) {
            x = x % 2 == 0 ? x / 2 : 3 * x + 1;
            count++;
            s += x + " ";
        }

        String[] str = s.trim().split(" ");
        int[] answer = new int[str.length];

        for (int i = 0; i < str.length; i++) {
            answer[i] = Integer.parseInt(str[i]);
        }

        return answer;
    }
}
