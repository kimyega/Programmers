package level_0;

import java.util.Arrays;
import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] words = line.split(" ");

        int[] array = new int[words.length];

        for (int i = 0; i < words.length; i++) {
            array[i] = Integer.parseInt(words[i]);
        }

        System.out.println(Arrays.toString(solution(array)));
    }

    static int[] solution(int[] array) {
        int[] answer = new int[2];
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                answer[1] = i;
            }
            max = Math.max(max, array[i]);
        }
        answer[0] = max;

        return answer;
    }
}
