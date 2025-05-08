package level_0;

import java.util.Scanner;

public class SuffixChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String my_string = sc.nextLine();
        String is_prefix = sc.nextLine();

        System.out.println(solution(my_string, is_prefix));
    }
    static int solution(String my_string, String is_suffix) {
        return my_string.endsWith(is_suffix) ? 1 : 0;
    }
}
