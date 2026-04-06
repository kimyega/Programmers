package level1.test_161989;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Repaint {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] section = new int[st.countTokens()];

        for (int i = 0; i < section.length; i++) {
            section[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(n, m, section));
    }

    public static int solution(int n, int m, int[] section) {
        int answer = 0, currPos = 0;

        for (int part : section) {
            if (part > currPos) {
                currPos = part + m - 1;
                answer++;
            }
        }

        return answer;
    }
}
