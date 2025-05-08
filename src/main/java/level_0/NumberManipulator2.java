package level_0;

import java.util.Scanner;

public class NumberManipulator2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int[] numLog = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            numLog[i] = Integer.parseInt(str[i]);
        }

        System.out.println(solution(numLog));
    }
    static String solution(int[] numLog) {
        String answer = "";

        for (int i = 0; i < numLog.length; i++) {
            if (i == 0) continue;

            int num = numLog[i] - numLog[i - 1];
            answer += num == 1 ? "w" : num == -1 ? "s" : num == 10 ? "d" : "a";
        }

        return answer;
    }
}
