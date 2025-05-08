package level_0;

import java.util.Scanner;

public class SubstringConcatenator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] my_strings = sc.nextLine().split(" ");

        int[][] parts = new int[my_strings.length][2];

        for (int i = 0; i < my_strings.length; i++) {
            parts[i][0] = sc.nextInt();
            parts[i][1] = sc.nextInt();
        }

        System.out.println(solution(my_strings, parts));
    }
    static String solution(String[] my_strings, int[][] parts) {
        String answer = "";

        for (int i = 0; i < my_strings.length; i++) {
            answer += my_strings[i].substring(parts[i][0], parts[i][1]);
        }

        return answer;
    }
}
