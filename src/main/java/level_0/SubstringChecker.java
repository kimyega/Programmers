package level_0;

import java.util.Scanner;

public class SubstringChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        System.out.println(solution(str1, str2));
    }
    static int solution(String str1, String str2) {
        return str2.contains(str1) ? 1 : 0;
    }
}
