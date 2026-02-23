package level_0;

import java.util.Scanner;

public class VerticalReader {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String my_string = sc.nextLine();
        int m = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(solution(my_string, m, c));

    }

    public static String solution(String my_string, int m, int c) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            if (i % m == c - 1) answer.append(my_string.charAt(i));
        }
        return answer.toString();
    }
}
