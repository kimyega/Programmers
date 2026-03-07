package level_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeProcessor {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String code = br.readLine();

        System.out.println(solution(code));
    }

    public static String solution(String code) {
        boolean mode = false;
        StringBuilder ret = new StringBuilder();

        for (int i = 0; i < code.length(); i++) {
            char c = code.charAt(i);

            if (c != '1' && i % 2 == (mode ? 1 : 0)) ret.append(c);

            if (c == '1') mode = !mode;
        }
        return ret.length() == 0 ? "EMPTY" : ret.toString();
    }
}
