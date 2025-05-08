package level_0;

import java.util.Scanner;

public class StringSuffixExtractor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String my_string = sc.nextLine();
        int n = Integer.parseInt(sc.nextLine());

        System.out.println(solution(my_string, n));
    }
    static String solution(String my_string, int n) {
        return my_string.substring(my_string.length() - n);
    }
}
