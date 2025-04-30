package level_0;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayElementAdder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] words = line.split(" ");

        int[] arr = new int[words.length];

        for (int i = 0; i < words.length; i++) {
            arr[i] = Integer.parseInt(words[i]);
        }

        System.out.println(Arrays.toString(solution(arr)));
    }
    static int[] solution(int[] arr) {
        int count = 0;
        for (int num : arr) {
            count += num;
        }

        int[] answer = new int[count];

        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                answer[index] = arr[i];
                index++;
            }
        }

        return answer;
    }
}
