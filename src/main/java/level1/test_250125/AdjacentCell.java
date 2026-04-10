package level1.test_250125;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AdjacentCell {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        // 첫 줄: 세로(N) 가로(M)
        String[] size = br.readLine().split(" ");
        int n = Integer.parseInt(size[0]);
        int m = Integer.parseInt(size[1]);

        String[][] board = new String[n][m];

        // 보드 입력
        for (int i = 0; i < n; i++) {
            board[i] = br.readLine().split("");
        }

        // 기준 좌표 h, w 입력
        String[] pos = br.readLine().split(" ");
        int h = Integer.parseInt(pos[0]);
        int w = Integer.parseInt(pos[1]);

        int answer = solution(board, h, w);

        System.out.println(answer);
    }

    public static int solution(String[][] board, int h, int w) {

        int n = board.length, count = 0;

        int[] dh = {0, 1, -1, 0}, dw = {1, 0, 0, -1};

        for (int i = 0; i < 4; i++) {
            int h_check = h + dh[i];
            int w_check = w + dw[i];
            if (h_check >= 0 && h_check < n && w_check >= 0 && w_check < n) {
                if (board[h][w].equals(board[h_check][w_check])) count++;
            }
        }

        return count;
    }
}
