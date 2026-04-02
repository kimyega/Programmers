package level1.test_134240;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FoodFightContest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int[] food = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            food[i] = Integer.parseInt(input[i]);
        }

        System.out.println(solution(food));
    }

    public static String solution(int[] food) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < food.length; i++) {
            sb.append(String.valueOf(i).repeat(food[i] / 2));
        }

        String reversed = new StringBuilder(sb.toString()).reverse().toString();

        return sb.append("0").append(reversed).toString();
    }
}
