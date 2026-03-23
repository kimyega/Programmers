package level1.test_12925;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringToIntConverter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        System.out.println(solution(s));
    }

    public static int solution(String s) {
        return Integer.parseInt(s);
    }
}
