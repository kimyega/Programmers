package level_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BeadCombination {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int balls =  Integer.parseInt(st.nextToken());
        int share =  Integer.parseInt(st.nextToken());

        System.out.println(solution(balls, share));
    }

    public static int solution(int balls, int share) {

        long answer = 1;

        share = Math.min(share, balls - share);

        for (int i = 1; i <= share; i++) {
            answer = answer * (balls - i + 1) / i;
        }

        return (int) answer;
    }
}
