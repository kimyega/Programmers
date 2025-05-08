package level_0;

import java.util.Arrays;
import java.util.Scanner;

public class LastTwoElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] parts = sc.nextLine().split(" ");
        int[] num_list = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            num_list[i] = Integer.parseInt(parts[i]);
        }

        System.out.println(Arrays.toString(solution(num_list)));
    }
    static int[] solution(int[] num_list) {

        int last = num_list[num_list.length - 1];
        int pLast = num_list[num_list.length - 2];
        int add = last > pLast ? last - pLast : last * 2;

        int[] answer = Arrays.copyOf(num_list, num_list.length + 1);
        answer[answer.length - 1] = add;

        return answer;
    }
}
