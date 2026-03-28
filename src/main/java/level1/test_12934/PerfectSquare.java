package level1.test_12934;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PerfectSquare {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(br.readLine());
        System.out.println(solution(n));
    }

    public static long solution(long n) {
        long sqrt = (long) Math.sqrt(n);
        return sqrt * sqrt == n ? (sqrt + 1) * (sqrt + 1) : -1;
    }
}
