package level_0;

import java.util.Arrays;
import java.util.Scanner;

public class ElementLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        String[] lines = new String[n];
        for (int i = 0; i < n; i++) {
            lines[i] = sc.nextLine();
        }

        System.out.println(Arrays.toString(solution(lines)));

    }
    static int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        for (int i = 0; i < strlist.length; i++) {
            answer[i] = strlist[i].length();
        }
        return answer;
    }
}
