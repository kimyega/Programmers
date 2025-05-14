package level_0;

import java.util.Scanner;

public class StringConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(solution(n));
    }
    static String solution(int n) {
        return n + "";
    }
}
