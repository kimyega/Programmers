package level1.test_155652;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SecretCipher {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String s = st.nextToken();
        String skip = st.nextToken();
        int index = Integer.parseInt(st.nextToken());

        System.out.println(solution(s, skip, index));
    }

    public static String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();

        int[] alphabet = new int[26];

        for (char c : skip.toCharArray()) {
            alphabet[c - 'a']++;
        }

        for (char c : s.toCharArray()) {
            int count = 0, idx = 0;

            while (count < index){
                idx++;
                if (alphabet[(c - 'a' + idx) % 26] == 0) count++;
            }
            sb.append((char)((c - 'a' + idx) % 26 + 'a'));
        }

        return sb.toString();
    }
}
