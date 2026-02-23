package level_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PowerOfTwoMatrix {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1. 배열 입력 (공백 구분)
        String[] parts = br.readLine().trim().split("\\s+");
        int[] num_list = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            num_list[i] = Integer.parseInt(parts[i]);
        }

        // 2. n 입력
        int n = Integer.parseInt(br.readLine().trim());

        // 3. solution 함수 호출
        int[][] results = solution(num_list, n);

        // 4. 결과 출력 (행 단위, 공백으로 구분)
        for (int[] result: results) {
            System.out.println(Arrays.toString(result));
        }

    }

    public static int[][] solution(int[] num_list, int n) {
        int len = num_list.length / n;
        int[][] answer = new int[len][n];

        for (int i = 0; i < len; i++) {
            answer[i] = Arrays.copyOfRange(num_list, i * n, (i + 1) * n);
        }

        return answer;
    }
}
