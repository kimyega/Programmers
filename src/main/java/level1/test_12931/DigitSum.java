package level1.test_12931;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DigitSum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n =  Integer.parseInt(br.readLine());
        System.out.println(solution(n));
    }

    public static int solution(int n) {
        int answer = 0;

        while (n > 0) {
            answer = answer + n % 10;
            n = n / 10;
        }
        return answer;
    }
}
