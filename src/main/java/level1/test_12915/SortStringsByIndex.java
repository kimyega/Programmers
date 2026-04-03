package level1.test_12915;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SortStringsByIndex {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] strings = br.readLine().split(" ");
        int n = Integer.parseInt(br.readLine());

        System.out.println(Arrays.toString(solution(strings, n)));
    }

    public static String[] solution(String[] strings, int n) {
        String[] answer = strings.clone();

        Arrays.sort(answer, (a, b) -> {
            if (a.charAt(n) == b.charAt(n)) return a.compareTo(b);
            return a.charAt(n) - b.charAt(n);
        });

        return answer;
    }
}
