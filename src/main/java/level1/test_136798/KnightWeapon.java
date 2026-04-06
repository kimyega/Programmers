package level1.test_136798;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class KnightWeapon {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int number =  Integer.parseInt(st.nextToken());
        int limit  = Integer.parseInt(st.nextToken());
        int power = Integer.parseInt(st.nextToken());

        System.out.println(solution(number, limit, power));
    }

    public static int solution(int number, int limit, int power) {
        int answer = 0;

        for (int i = 1; i <= number; i++) {
            int divs = countDivisors(i);
            answer += divs > limit ? power : divs;
        }

        return answer;
    }

    private static int countDivisors(int number) {
        int count = 0;
        for (int i = 1; i * i<= number; i++) {
            if (number % i == 0) {
                count++;
                if (i != number / i) count++;
            }

        }
        return count;
    }
}
