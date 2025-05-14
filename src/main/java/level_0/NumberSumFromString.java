package level_0;

import java.util.Scanner;

public class NumberSumFromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num_str = sc.nextLine();

        System.out.println(solution(num_str));
    }
    static int solution(String num_str) {
        int answer = 0;

        for (char c : num_str.toCharArray()) {
            answer += c - '0';
        }

        return answer;
    }
}
