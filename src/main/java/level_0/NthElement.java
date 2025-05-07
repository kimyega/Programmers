package level_0;

import java.util.Arrays;
import java.util.Scanner;

public class NthElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int[] num_list = new int[input.length];
        for (int i = 0; i < num_list.length; i++) {
            num_list[i] = Integer.parseInt(input[i]);
        }

        int n = sc.nextInt();
        System.out.println(Arrays.toString(solution(num_list, n)));

    }
    static int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length - n + 1];

        System.arraycopy(num_list, n - 1, answer, 0, answer.length);
        return answer;
    }
}
