package level_0;

import java.util.Scanner;

public class StringContains {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(solution(str1, str2));

    }
    static int solution(String str1, String str2) {
        int answer = 0;
        int length = str1.length();
        int afterLength = str1.replaceAll(str2, "").length();
        if (length > afterLength) {
            answer = 1;
        } else {
            answer = 2;
        }
        return answer;
    }
}
