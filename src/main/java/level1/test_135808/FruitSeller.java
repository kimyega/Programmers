package level1.test_135808;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class FruitSeller {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] score = new int[st.countTokens()];

        for (int i = 0; i < score.length; i++) {
            score[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(k, m, score));
    }

    public static int solution(int k, int m, int[] score) {
        int answer = 0;

        Arrays.sort(score);

        for (int i = score.length % m; i < score.length - 1; i += m) {
            answer  += score[i] * m;
        }

        return answer;
    }
}
