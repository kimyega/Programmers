package level1.test_140108;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringSplitter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        System.out.println(solution(s));
    }

    public static int solution(String s) {
        int result = 0;
        int diff = 0;
        char x = s.charAt(0);

        for (char c : s.toCharArray()) {

            if (diff == 0) x = c;

            if (c == x) diff++;
            else diff--;

            if (diff == 0) result++;
        }

        return diff != 0 ? ++result : result;
    }
}
