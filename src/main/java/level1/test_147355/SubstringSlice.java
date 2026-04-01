package level1.test_147355;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SubstringSlice {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        String t = st.nextToken();
        String p = st.nextToken();

        System.out.println(solution(t, p));
    }

    public static int solution(String t, String p) {
        int cnt = 0;

        for (int i = 0; i <= t.length() - p.length(); i++) {
            String sub = t.substring(i, i + p.length());
            if (sub.compareTo(p) <= 0) cnt++;
        }

        return cnt;
    }
}
