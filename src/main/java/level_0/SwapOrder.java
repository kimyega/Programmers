package level_0;

import java.util.Arrays;
import java.util.Scanner;

public class SwapOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        int[] num_list = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            num_list[i] = Integer.parseInt(arr[i]);
        }

        int n = num_list.length;

        System.out.println(Arrays.toString(solution(num_list, n)));
    }
    static int[] solution(int[] num_list, int n) {
        String line = "";

        for (int num : num_list) {
            line += num;
        }

        line = line.substring(n) + line.substring(0, n);
        String[] words = line.split("");
        int[] answer = new int[num_list.length];

        for (int i = 0; i < words.length; i++) {
            answer[i] = Integer.parseInt(words[i]);
        }

        return answer;
    }
}
