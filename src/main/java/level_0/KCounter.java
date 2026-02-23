package level_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class KCounter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int i = Integer.parseInt(st.nextToken());
        int j = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        System.out.println(solution(i, j, k));
    }

    public static int solution(int i, int j, int k) {
        return (int) IntStream.rangeClosed(i, j)
                .mapToObj(String::valueOf)
                .flatMapToInt(String::chars)
                .filter(ch -> ch == (k + '0'))
                .count();
    }

}
