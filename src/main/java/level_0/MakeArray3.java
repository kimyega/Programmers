package level_0;

import java.util.Arrays;
import java.util.Scanner;

public class MakeArray3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split(" ");
        int[] arr = new int[line.length];
        for (int i = 0; i < line.length; i++) {
            arr[i] = Integer.parseInt(line[i]);
        }

        int[][] intervals = new int[2][2];
        for (int i = 0; i < 2; i++) {
            String[] words = sc.nextLine().split(" ");

            for (int j = 0; j < 2; j++) {
                intervals[i][j] = Integer.parseInt(words[j]);
            }
        }

        System.out.println(Arrays.toString(solution(arr, intervals)));
    }
    static int[] solution(int[] arr, int[][] intervals) {

        int s1 = intervals[0][0];
        int e1 = intervals[0][1];
        int s2 = intervals[1][0];
        int e2 = intervals[1][1];

        int len = (e1 - s1 + 1) + (e2 - s2 + 1);
        int[] answer = new int[len];
        int idx = 0;

        for (int i = s1; i <= e1; i++) {
            answer[idx++] = arr[i];
        }

        for (int i = s2; i <= e2; i++) {
            answer[idx++] = arr[i];
        }

        return answer;
    }
}
