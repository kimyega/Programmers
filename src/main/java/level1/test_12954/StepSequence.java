package level1.test_12954;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class StepSequence {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        System.out.println(Arrays.toString(solution(x,n)));
    }

    public static long[] solution(int x, int n) {
        return IntStream.rangeClosed(1, n).mapToLong(i -> (long)x * i).toArray();
    }
}
