package level_0;

import java.util.Scanner;
import java.util.stream.IntStream;

public class DiagonalTraverser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] board = new int[4][3];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        int k = sc.nextInt();

        System.out.println(solution(board, k));
    }
    public static int solution(int[][] board, int k) {
        return IntStream.range(0, board.length)
                .map(i -> IntStream.range(0, board[i].length)
                        .filter(j -> i + j <= k)
                        .map(j -> board[i][j])
                        .sum()
                )
                .sum();
    }
}
