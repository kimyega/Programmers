package level1.test_87389;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class RemainderOneFinder {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        System.out.println(solution(n));
    }

    public static int solution(int n) {
        return IntStream.iterate(2, i -> i + 1).filter(i -> n % i == 1).findFirst().orElse(0);
    }
}
