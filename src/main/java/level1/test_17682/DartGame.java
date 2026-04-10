package level1.test_17682;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class DartGame {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String dartResult = br.readLine();

        System.out.println(solution(dartResult));
    }

    public static int solution(String dartResult) {
        int score = 0;

        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < dartResult.length(); i++) {
            char c = dartResult.charAt(i);

            if (Character.isDigit(c)) {
                score += c - '0';
                if (c == '1' && i + 1 < dartResult.length() && dartResult.charAt(i + 1) == '0') {
                    score = 10;
                    i++;
                }
            }
            else if (Character.isAlphabetic(c)) {
                int powNum = c == 'S' ? 1 : c == 'D' ? 2 : 3;
                score = (int) Math.pow(score, powNum);

            }
            else if (c == '*'){
                if (!stack.isEmpty()) {
                    int top = stack.pop();
                    stack.push(top * 2);
                }
                score *= 2;
            }
            else if (c == '#') score *= -1;


            if (i == dartResult.length() - 1 ||
                    Character.isDigit(dartResult.charAt(i + 1))) {
                stack.push(score);
                score = 0;
            }
        }

        return stack.stream().mapToInt(Integer::intValue).sum();
    }
}
