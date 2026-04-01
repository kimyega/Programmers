package level1.test_12930;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WeirdString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        System.out.println(solution(s));
    }

    public static String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int idx = 0;

        for (char c : s.toCharArray()) {
            if (c == ' ') idx = -1;
            else if (idx % 2 == 0) c = Character.toUpperCase(c);
            else c = Character.toLowerCase(c);
            sb.append(c);
            idx++;
        }

        return sb.toString();
    }
}
