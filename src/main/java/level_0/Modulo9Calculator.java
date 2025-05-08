package level_0;

import java.util.Scanner;

public class Modulo9Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();

        System.out.println(solution(number));
    }
    static int solution(String number) {
        int answer = 0, sum = 0;

        for (char c : number.toCharArray()) {
            sum += (c - '0') % 9;
        }

        answer = sum % 9;
        return answer;
    }
}
