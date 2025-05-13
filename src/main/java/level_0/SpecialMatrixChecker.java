package level_0;

import java.util.Scanner;

public class SpecialMatrixChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(solution(arr));

    }
    static int solution(int[][] arr) {
        boolean notMatched = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] != arr[j][i]) {
                    notMatched = true;
                }
            }
        }

        return notMatched ? 0 : 1;
    }
}
