package level_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UniqueCharacter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        System.out.println(solution(s));
    }

    public static String solution(String s) {
        int[] alpha = new int[26];

        for (char c : s.toCharArray()) {
            alpha[c - 'a']++;
        }

        StringBuilder sb = new StringBuilder();

        for (int t = 0; t < 26; t++) {
            if (alpha[t] == 1) sb.append((char) (t + 'a'));
        }

        return sb.toString();
    }
}
