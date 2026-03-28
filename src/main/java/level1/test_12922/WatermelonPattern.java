package level1.test_12922;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WatermelonPattern {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        System.out.println(solution(n));
    }

    public static String solution(int n) {
        return "수박".repeat(n / 2) + "수".repeat(n % 2);
    }
}
