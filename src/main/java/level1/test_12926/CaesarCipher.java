package level1.test_12926;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CaesarCipher {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int n = Integer.parseInt(br.readLine());

        System.out.println(solution(s,n));
    }

    public static String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == ' ') {
                sb.append(c);
                continue;
            }
            int base = Character.isUpperCase(c) ? 'A' : 'a';
            sb.append((char) ((c - base + n) % 26 + base));
        }

        return sb.toString();
    }
}
