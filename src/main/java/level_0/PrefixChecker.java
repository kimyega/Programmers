package level_0;

import java.util.Scanner;

public class PrefixChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String my_string = sc.nextLine();
        String is_prefix = sc.nextLine();

        System.out.println(solution(my_string, is_prefix));
    }
    static int solution(String my_string, String is_prefix) {
        return my_string.startsWith(is_prefix) ? 1 : 0;
    }
}
