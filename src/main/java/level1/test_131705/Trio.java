package level1.test_131705;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Trio {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int[] number = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            number[i] = Integer.parseInt(input[i]);
        }

        System.out.println(solution(number));
    }

    public static int solution(int[] number) {
        int answer = 0;

        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                for (int k = j + 1; k < number.length; k++) {
                    int sum = number[i] + number[j] + number[k];
                    if (sum == 0) answer++;
                }
            }
        }
        return answer;
    }
}
