package level_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SafeZone {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] board = new int[n][n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j = 0; j < n; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int result = solution(board);
        System.out.println(result);
    }

    public static int solution(int[][] board) {
        int count = 0, bLen = board.length;

        int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

        boolean[][] danger = new boolean[bLen][bLen];

        for (int i = 0; i < bLen; i++) {
            for (int j = 0; j < bLen; j++) {
                if (board[i][j] == 1) {

                    danger[i][j] = true;

                    for (int d = 0; d < 8; d++) {

                        int nx =  i + dx[d];
                        int ny =  j + dy[d];

                        if (nx >= 0 && nx < bLen && ny >= 0 && ny < bLen) danger[nx][ny] = true;
                    }
                }
            }
        }

        for (boolean[] dan : danger) {
            for (boolean b : dan) {
                if (b) count++;
            }
        }

        return bLen * bLen - count;
    }
}
