package level1.test_12933;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

public class DescendingSorter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(br.readLine());

        System.out.println(solution(n));
    }

    public static long solution(long n) {
        String sorted = Long.toString(n)
                .chars()
                .mapToObj(c -> (char) c)
                .sorted((a, b) -> b - a)
                .map(String::valueOf)
                .collect(Collectors.joining());

        return Long.parseLong(sorted);
    }
}
