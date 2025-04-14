package level_0;

import java.util.Arrays;
import java.util.Scanner;

public class EvenOddCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] parts = line.split(" ");

        int[] num_list = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            num_list[i] = Integer.parseInt(parts[i]);
        }

        System.out.println(Arrays.toString(solution(num_list)));
    }
    static int[] solution(int[] num_list) {
        int[] answer = new int[2];
        for (int num : num_list) {
            if (num % 2 == 0) {
                answer[0]++;
            } else {
                answer[1]++;
            }
        }
        return answer;
    }
}
