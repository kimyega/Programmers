package level_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MakeSquare {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // 행, 열 입력
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][m];

        // 배열 입력
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(Arrays.deepToString(solution(arr)));

    }

    public static int[][] solution(int[][] arr) {
        int max = Math.max(arr[0].length, arr.length);
        int[][] answer = new int[max][max];

        for (int i = 0; i < arr.length; i++) {
            System.arraycopy(arr[i], 0, answer[i], 0, arr[i].length);
        }

        return answer;
    }
}
