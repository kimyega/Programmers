package level_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CharacterPosition {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] keyinput = br.readLine().split(" ");
        String[] board_str =  br.readLine().split(" ");
        int[] board = new int[board_str.length];

        for (int i = 0; i < board_str.length; i++) board[i] = Integer.parseInt(board_str[i]);

        System.out.println(Arrays.toString(solution(keyinput, board)));
    }

    public static int[] solution(String[] keyinput, int[] board) {
        int[] pos = new int[2];

        int maxX = board[0] / 2,  maxY = board[1] / 2;

        for (String key : keyinput) {

            int dx = 0, dy = 0;

            switch (key) {
                case "up": dy++; break;
                case "down": dy--; break;
                case "left": dx--; break;
                case "right": dx++; break;
            }

            int nextX = pos[0] + dx;
            int nextY = pos[1] + dy;

            if (Math.abs(nextX) <= maxX && Math.abs(nextY) <= maxY) {
                pos[0] = nextX;
                pos[1] = nextY;
            }
        }

        return pos;
    }
}
