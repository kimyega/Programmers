package level_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountSeven {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 한 줄 입력
        String[] input = br.readLine().split(" ");
        int[] array = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            array[i] = Integer.parseInt(input[i]);
        }

        System.out.println(solution(array));
    }

    public static int solution(int[] array) {
        int answer = 0;

        for (int num : array) {
            while (num != 0) {
                if (num % 10 == 7) answer++;
                num /= 10;
            }
        }

        return answer;
    }
}
