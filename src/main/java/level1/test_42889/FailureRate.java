package level1.test_42889;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class FailureRate {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] stages = new int[st.countTokens()];

        for (int i = 0; i < stages.length; i++) {
            stages[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(Arrays.toString(solution(N, stages)));
    }

    public static int[] solution(int N, int[] stages) {
        int[] clear =  new int[N];

        for (int stage : stages) {
            if (stage <= N) clear[stage - 1]++;
        }

        double[] failure = new double[N];
        Integer[] idx = new Integer[N];

        int players = stages.length;

        for (int i = 0; i < N; i++) {
            failure[i] = players == 0 ? 0 : (double) clear[i] /  players;
            players -= clear[i];
            idx[i] = i;
        }

        Arrays.sort(idx, (a, b) -> {
            int cmp = Double.compare(failure[b], failure[a]);
            return cmp != 0 ? cmp : a - b;
        });

        int[] answer = new int[N];

        for (int i = 0; i < N; i++) {
            answer[i] = idx[i] + 1;
        }

        return answer;
    }
}
