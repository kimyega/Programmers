package level_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArithmeticSequenceSum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        int d = Integer.parseInt(br.readLine());

        String[] input = br.readLine().split(" ");

        boolean[] included = new boolean[input.length];

        for (int i = 0; i < input.length; i++) {
            included[i] = Boolean.parseBoolean(input[i]);
        }

        System.out.println(solution(a, d, included));
    }

    public static int solution(int a, int d, boolean[] included) {
        int answer = 0;
        for (int i = 0; i < included.length; i++) {
            if (included[i]) answer += a + d * i;
        }
        return answer;
    }
}
