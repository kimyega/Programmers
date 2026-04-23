package level1.test_131128;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NumberPair {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        String X = st.nextToken();
        String Y = st.nextToken();

        System.out.println(solution(X, Y));
    }

    public static String solution(String X, String Y) {
        int[] xCnt = new int[10];
        int[] yCnt = new int[10];

        for (int i = 0; i < X.length(); i++) {
            xCnt[X.charAt(i) - '0']++;
        }

        for (int i = 0; i < Y.length(); i++) {
            yCnt[Y.charAt(i) - '0']++;
        }

        int[] pairs = new int[10];

        for (int i = 0; i < pairs.length; i++) {
            if (xCnt[i] > 0 && yCnt[i] > 0) pairs[i] = Math.min(xCnt[i], yCnt[i]);
        }

        StringBuilder sb = new StringBuilder();

        for (int i = pairs.length - 1; i >= 0; i--) {
            while (pairs[i] > 0) {
                sb.append(i);
                pairs[i]--;
            }
        }

        return sb.length() == 0 ? "-1" : sb.charAt(0) == '0' ? "0" : sb.toString();
    }
}
