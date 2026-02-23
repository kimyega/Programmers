package level_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class QrCode {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int q = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        String code = br.readLine();

        System.out.println(solution(q, r, code));
    }

    public static String solution(int q, int r, String code) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < code.length(); i++) {
            char ch = code.charAt(i);
            if (i % q == r) sb.append(ch);
        }
        return sb.toString();
    }
}
