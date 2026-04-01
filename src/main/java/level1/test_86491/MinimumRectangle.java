package level1.test_86491;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinimumRectangle {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 배열 행 개수 입력
        System.out.println("명함 개수를 입력하세요:");
        int n = Integer.parseInt(br.readLine());
        int[][] sizes = new int[n][2];

        System.out.println("각 명함의 가로와 세로를 공백으로 구분하여 입력하세요:");
        for (int i = 0; i < n; i++) {
            String[] parts = br.readLine().split(" ");
            sizes[i][0] = Integer.parseInt(parts[0]); // 가로
            sizes[i][1] = Integer.parseInt(parts[1]); // 세로
        }

        // solution 호출 후 결과 출력
        System.out.println(solution(sizes));
    }

    public static int solution(int[][] sizes) {
        int w = 0, h = 0;

        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] > sizes[i][1]) {
                int temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }

            w = Math.max(w, sizes[i][0]);
            h = Math.max(h, sizes[i][1]);
        }

        return w * h;
    }
}
