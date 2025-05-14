package level_0;

import java.util.Scanner;

public class StringToIntParser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n_str = sc.nextLine();

        System.out.println(solution(n_str));
    }
    static int solution(String n_str) {
        return Integer.parseInt(n_str);
    }
}
