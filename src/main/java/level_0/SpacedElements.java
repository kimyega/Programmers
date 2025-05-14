package level_0;

import java.util.Arrays;
import java.util.Scanner;

public class SpacedElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] parts = sc.nextLine().split(" ");
        int[] num_list = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            num_list[i] = Integer.parseInt(parts[i]);
        }

        int n = sc.nextInt();

        System.out.println(Arrays.toString(solution(num_list, n)));
    }
    static int[] solution(int[] num_list, int n) {
        int len = num_list.length, idx = 0;
        int[] answer = new int[len % n == 0 ? len / n : len / n + 1];

        for (int i = 0; i < len; i += n) {
            answer[idx] = num_list[i];
            idx++;
        }

        return answer;
    }
}
