package level1.test_12928;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class DivisorSum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        System.out.println(solution(n));
    }

    public static int solution(int n) {
        return IntStream.rangeClosed(1, n).filter(i -> n % i == 0).sum();
    }
}
