package level1.test_12947;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HarshadNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());

        System.out.println(solution(x));
    }

    public static boolean solution(int x) {
        int sum = 0, n = x;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return x % sum == 0;
    }
}
