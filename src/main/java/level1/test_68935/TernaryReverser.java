package level1.test_68935;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TernaryReverser {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        System.out.println(solution(n));
    }

    public static int solution(int n) {
        StringBuilder sb = new StringBuilder(Integer.toString(n, 3)).reverse();
        return Integer.parseInt(sb.toString(), 3);
    }
}
