package level1.test_12903;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MiddleCharacter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        System.out.println(solution(s));
    }

    public static String solution(String s) {
        int len = s.length();
        return s.substring(len / 2 - 1 + len % 2, len / 2 + 1);
    }
}
