package level_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class RangeOfTwo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 한 줄 입력
        String[] input = br.readLine().split(" ");
        int[] arr = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        System.out.println(Arrays.toString(solution(arr)));
    }

    public static int[] solution(int[] arr) {

        int start = -1;
        int end = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                if (start == -1) start = i;
                end = i;
            }
        }

        return start == -1 ? new int[] {-1} : Arrays.copyOfRange(arr, start, end + 1);
    }
}
