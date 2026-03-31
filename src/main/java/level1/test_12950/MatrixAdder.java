package level1.test_12950;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MatrixAdder {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1. 행과 열 개수 입력 (예: "2 3")
        String[] size = br.readLine().split(" ");
        int n = Integer.parseInt(size[0]); // 행
        int m = Integer.parseInt(size[1]); // 열

        // 2. 첫 번째 행렬 입력
        int[][] arr1 = new int[n][m];
        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                arr1[i][j] = Integer.parseInt(line[j]);
            }
        }

        // 3. 두 번째 행렬 입력
        int[][] arr2 = new int[n][m];
        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                arr2[i][j] = Integer.parseInt(line[j]);
            }
        }

        // 4. 행렬 덧셈 호출
        int[][] result = solution(arr1, arr2);

        System.out.println(Arrays.deepToString(result));
    }

    public static int[][] solution(int[][] arr1, int[][] arr2) {

        int[][] result = new int[arr1.length][arr1[0].length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                result[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return result;
    }
}
