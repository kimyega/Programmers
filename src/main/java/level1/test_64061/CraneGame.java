package level1.test_64061;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class CraneGame {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1. 보드 크기
        int n = Integer.parseInt(br.readLine());

        // 2. 보드 입력
        int[][] board = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                board[i][j] = Integer.parseInt(input[j]);
            }
        }

        // 3. moves 입력
        String[] moveInput = br.readLine().split(" ");
        int[] moves = new int[moveInput.length];

        for (int i = 0; i < moveInput.length; i++) {
            moves[i] = Integer.parseInt(moveInput[i]);
        }

        // 4. 함수 호출
        int result = solution(board, moves);
        System.out.println(result);
    }

    public static int solution(int[][] board, int[] moves) {
        int answer = 0;

        Deque<Integer> basket = new ArrayDeque<>();

        List<Deque<Integer>> crane = new ArrayList<>();

        for (int j = 0; j < board.length; j++) {
            Deque<Integer> stack = new ArrayDeque<>();
            for (int i =  board.length - 1; i >= 0; i--) {
                if (board[i][j] != 0) stack.push(board[i][j]);
            }
            crane.add(stack);
        }

        for (int move : moves) {
            Deque<Integer> line = crane.get(move - 1);
            int doll = line.isEmpty() ? -1 : line.pop();

            if (doll == -1) continue;

            if (!basket.isEmpty() && doll == basket.peek()) {
                basket.pop();
                answer += 2;
            } else {
                basket.push(doll);
            }
        }

        return answer;
    }
}
