package level_0;

import java.util.Scanner;

public class RockSissorPaper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String rsp = sc.nextLine();
        System.out.println(solution(rsp));
    }
    static String solution(String rsp) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < rsp.length(); i++) {
            char ch = rsp.charAt(i);
            if (ch == '2') {
                answer.append(0);
            } else if (ch == '0') {
                answer.append(5);
            } else if (ch == '5') {
                answer.append(2);
            }

        }
        return answer.toString();
    }
}
