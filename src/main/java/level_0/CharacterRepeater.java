package level_0;

import java.util.Scanner;

public class CharacterRepeater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String my_string = sc.nextLine();
        int n = sc.nextInt();

        System.out.println(solution(my_string, n));
    }
    static String solution(String my_string, int n) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            String str = my_string.charAt(i) + "";
            answer += str.repeat(n);
        }
        return answer;
    }
}
