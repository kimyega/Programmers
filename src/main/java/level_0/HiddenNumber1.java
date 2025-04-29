package level_0;

import java.util.Scanner;

public class HiddenNumber1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String my_string = sc.nextLine();

        System.out.println(solution(my_string));
    }
    static int solution(String my_string) {
        int answer = 0;

        for (char c : my_string.toCharArray()) {
            if (Character.isDigit(c)) {
                answer += c - '0';
            }
        }

        return answer;
    }
}
