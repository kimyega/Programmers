package level1.test_42840;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class MockExam {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] answers = new int[st.countTokens()];

        for (int i = 0; i < answers.length; i++) {
            answers[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(Arrays.toString(solution(answers)));
    }

    public static int[] solution(int[] answers) {
        String[] sp = {"12345", "21232425", "3311224455"};
        int[] scores = new int[sp.length];
        int max = 0;

        for (int i = 0; i < sp.length; i++) {
            for (int j = 0; j < answers.length; j++) {
                if (answers[j] == (sp[i].charAt(j % sp[i].length()) - '0')) scores[i]++;
            }
            max = Math.max(max, scores[i]);
        }

        int finalMax = max;
        return IntStream.range(0, scores.length).filter(i -> scores[i] == finalMax).map(i -> i + 1).toArray();
    }
}
