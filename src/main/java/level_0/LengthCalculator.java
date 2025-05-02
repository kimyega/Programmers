package level_0;

import java.util.Scanner;

public class LengthCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] parts = line.split(" ");
        int[] num_list = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            num_list[i] = Integer.parseInt(parts[i]);
        }

        System.out.println(solution(num_list));
    }
    static int solution(int[] num_list) {
        boolean isOverEle = num_list.length >= 11;
        int answer = isOverEle ? 0 : 1;

        for (int num : num_list) {
            if (isOverEle) {
                answer += num;
            } else {
                answer *= num;
            }
        }

        return answer;
    }
}
