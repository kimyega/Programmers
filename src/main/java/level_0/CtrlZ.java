package level_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class CtrlZ {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        System.out.println(solution(s));
    }

    public static int solution(String s) {

        Deque<Integer> stack = new ArrayDeque<>();

        for (String word : s.split(" ")) {
            if (word.equals("Z")) stack.pop();
            else stack.push(Integer.parseInt(word));
        }

        return stack.stream().mapToInt(x -> x).sum();
    }
}
