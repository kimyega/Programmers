package level_0;

import java.util.Scanner;

public class SubstringFront {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String my_string = sc.nextLine();
        int n = sc.nextInt();
        System.out.println(solution(my_string, n));
    }
    static String solution(String my_string, int n) {
        return my_string.substring(0, n);
    }
}
