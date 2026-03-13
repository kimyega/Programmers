package level_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OverlappingLineLength {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    }

    public static int solution(int[][] lines) {
        int answer = 0;
        int[] arr = new int[201];

        for (int[] line : lines) {
            for (int i = line[0]; i < line[1]; i++) {
                arr[i + 100]++;
            }
        }

        for (int x : arr) {
            if (x > 1) answer++;
        }

        return answer;
    }
}
