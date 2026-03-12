package level_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ConsecutiveSum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int total = Integer.parseInt(br.readLine());

        System.out.println(Arrays.toString(solution(num, total)));
    }

    public static int[] solution(int num, int total) {

        int start = (total / num) - (num - 1) / 2;

        int[] answer = new int[num];

        for (int i = 0; i < num; i++) {
            answer[i] = start + i;
        }

        return answer;
    }
}
