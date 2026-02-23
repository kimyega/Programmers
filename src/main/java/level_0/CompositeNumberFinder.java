package level_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CompositeNumberFinder {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        System.out.println(solution(n));
    }

    public static int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            int count = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) count++;
            }

            if (count >= 3) answer++;
        }

        return answer;
    }
}
