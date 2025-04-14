package level_0;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] str = line.split(" ");

        int[] numbers = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            numbers[i] = Integer.parseInt(str[i]);
        }

        System.out.println(Arrays.toString(solution(numbers)));

    }
    static int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        for (int i = 0; i < num_list.length; i++) {
            answer[num_list.length - i - 1] = num_list[i];
        }
        return answer;
    }
}
