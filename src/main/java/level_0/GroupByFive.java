package level_0;

import java.util.Arrays;
import java.util.Scanner;

public class GroupByFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = sc.nextLine().split(" ");

        System.out.println(Arrays.toString(solution(names)));
    }
    static String[] solution(String[] names) {
        int len = names.length;
        String[] answer = new String[len % 5 == 0 ? len / 5 : len / 5 + 1];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = names[i * 5];
        }
        return answer;
    }
}
