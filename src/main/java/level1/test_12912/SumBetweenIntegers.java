package level1.test_12912;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.stream.LongStream;

public class SumBetweenIntegers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.println(solution(a, b));
    }

    public static long solution(int a, int b) {
        return LongStream.rangeClosed(Math.min(a, b), Math.max(a, b)).sum();
    }
}
