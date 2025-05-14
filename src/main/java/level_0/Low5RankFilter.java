package level_0;

import java.util.Arrays;
import java.util.Scanner;

public class Low5RankFilter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] parts = sc.nextLine().split(" ");
        int[] num_list = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            num_list[i] = Integer.parseInt(parts[i]);
        }

        System.out.println(Arrays.toString(num_list));
    }
    static int[] solution(int[] num_list) {

        Arrays.sort(num_list);

        int[] answer = new int[num_list.length - 5];

        System.arraycopy(num_list, 5, answer, 0, answer.length);

        return answer;
    }
}
