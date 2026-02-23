package level_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ClosestNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 한 줄 입력
        String[] input = br.readLine().split(" ");
        int[] array = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            array[i] = Integer.parseInt(input[i]);
        }

        int n = Integer.parseInt(br.readLine());

        System.out.println(solution(array, n));
    }

    public static int solution(int[] array, int n) {
        int minDiff = Integer.MAX_VALUE;
        int result = 0;

        Arrays.sort(array);

        for (int num : array) {
            int diff = Math.abs(num - n);
            if (diff < minDiff) {
                minDiff = diff;
                result = num;
            }
        }
        return result;
    }
}
