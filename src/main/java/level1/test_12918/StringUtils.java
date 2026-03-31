package level1.test_12918;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringUtils {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        System.out.println(solution(s));
    }

    public static boolean solution(String s) {
        try {
            if (s.length() != 4 && s.length() != 6) return false;
            Integer.parseInt(s);
            return true;
        }  catch (Exception e) {
            return false;
        }
    }
}
