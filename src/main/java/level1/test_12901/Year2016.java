package level1.test_12901;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.StringTokenizer;

public class Year2016 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.println(solution(a, b));
    }

    public static String solution(int a, int b) {
        LocalDate date = LocalDate.of(2016, a, b);
        return date.getDayOfWeek().name().substring(0, 3);
    }
}
