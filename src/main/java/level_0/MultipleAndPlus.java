package level_0;

import java.util.Scanner;

public class MultipleAndPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] parts = sc.nextLine().split(" ");
        int[] num_list = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            num_list[i] = Integer.parseInt(parts[i]);
        }

        System.out.println(solution(num_list));
    }
    static int solution(int[] num_list) {
        int sum = 0, multiple = 1, answer = 0;

        for (int num : num_list) {
            sum += num;
            multiple *= num;
        }
        answer = multiple < sum * sum ? 1 : 0;
        return answer;
    }
}
