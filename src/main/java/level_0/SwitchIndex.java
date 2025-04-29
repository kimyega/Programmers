package level_0;

import java.util.Scanner;

public class SwitchIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String my_string = sc.nextLine();
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println(solution(my_string, num1, num2));
    }
    static String solution(String my_string, int num1, int num2) {
        String answer = "";

        char[] chars = my_string.toCharArray();
        char first = chars[num1];
        char sec = chars[num2];

        chars[num1] = sec;
        chars[num2] = first;

        for (char c : chars) {
            answer += c;
        }

        return answer;
    }
}
