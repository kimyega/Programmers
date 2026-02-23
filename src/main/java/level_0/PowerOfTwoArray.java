package level_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PowerOfTwoArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 한 줄 입력 받기
        String line = br.readLine();

        // 공백 기준으로 나눠서 int 배열로 변환
        String[] parts = line.trim().split("\\s+");
        int[] arr = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            arr[i] = Integer.parseInt(parts[i]);
        }

        System.out.println(Arrays.toString(solution(arr)));
    }

    public static int[] solution(int[] arr) {
        int n = arr.length;
        int len = Integer.toBinaryString(n).length();
        return Arrays.copyOf(arr, ((n & (n - 1)) == 0) ? n : (1 << len));
    }
}
