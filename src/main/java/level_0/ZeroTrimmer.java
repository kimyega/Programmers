package level_0;

import java.util.Scanner;

public class ZeroTrimmer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n_str = sc.nextLine();

        System.out.println(solution(n_str));
    }
    static String solution(String n_str) {
        return n_str.replaceAll("^0+", "");
    }
}
