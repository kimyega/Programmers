package level1.test_82612;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DeficitCalculator {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int price =  Integer.parseInt(st.nextToken());
        int money = Integer.parseInt(st.nextToken());
        int count  = Integer.parseInt(st.nextToken());

        System.out.println(solution(price, money, count));
    }

    public static long solution(int price, int money, int count) {
        long answer = money;

        for (int i = 1; i <= count; i++) {
            answer -= (long) price * i;
        }
        return answer > 0 ? 0 : -answer;
    }
}
