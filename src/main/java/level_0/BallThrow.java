package level_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BallThrow {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] num_str = br.readLine().split(" ");

        int[] numbers = new int[num_str.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(num_str[i]);
        }

        int k = Integer.parseInt(br.readLine());

        System.out.println(solution(numbers,k));
    }

    public static int solution(int[] numbers, int k) {
        return numbers[2 * (k - 1) % numbers.length];
    }
}
