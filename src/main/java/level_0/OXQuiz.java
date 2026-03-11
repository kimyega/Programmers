package level_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class OXQuiz {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] quiz = br.readLine().split(" ");

        System.out.println(Arrays.toString(solution(quiz)));
    }

    public static String[] solution(String[] quiz) {
        Deque<String> stack = new ArrayDeque<>();

        for (String s : quiz) {
            String[] tmp = s.split(" ");

            int a = Integer.parseInt(tmp[0]);
            String op = tmp[1];
            int b = Integer.parseInt(tmp[2]);
            int c = Integer.parseInt(tmp[4]);

            int result = op.equals("+") ? a + b : a - b;
            stack.add(result == c ? "O" : "X");
        }

        return stack.toArray(String[]::new);
    }
}
