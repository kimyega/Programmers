package level1.test_159994;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class CardStack {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] cards1 =  br.readLine().split(" ");
        String[] cards2 = br.readLine().split(" ");
        String[] goal = br.readLine().split(" ");

        System.out.println(solution(cards1, cards2, goal));
    }

    public static String solution(String[] cards1, String[] cards2, String[] goal) {

        Deque<String> c1 = new ArrayDeque<>(Arrays.asList(cards1));
        Deque<String> c2 = new ArrayDeque<>(Arrays.asList(cards2));

        for (String word : goal) {
            if (!c1.isEmpty() && c1.peek().equals(word)) c1.pollFirst();
            else if (!c2.isEmpty() && c2.peek().equals(word)) c2.pollFirst();
            else return "No";
        }

        return "Yes";
    }
}
