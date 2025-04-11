package level_0;

import java.util.Scanner;

public class Letter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.print(solution(str));
    }
    static int solution(String message) {
        int answer = message.length() * 2;
        return answer;
    }
}
