package level_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MakeToOne {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] parts = br.readLine().split(" ");

        int[] num_list = new  int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            num_list[i] = Integer.parseInt(parts[i]);
        }

        System.out.println(solution(num_list));
    }

    public static int solution(int[] num_list) {
        int answer = 0;

        for (int num : num_list) {
            answer += count(num);
        }

        return answer;
    }

    public static int count(int num) {
        int count = 0;
        while (num != 1) {
            num /= 2;
            count++;
        }
        return count;
    }
}
