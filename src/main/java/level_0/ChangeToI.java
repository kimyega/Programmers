package level_0;

import java.util.Scanner;

public class ChangeToI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String myString = sc.nextLine();

        System.out.println(solution(myString));
    }
    static String solution(String myString) {
        String answer = "";
        for (char c : myString.toCharArray()) {
            if (c < 'l') {
                answer += 'l';
            } else {
                answer += c;
            }
        }
        return answer;
    }
}
