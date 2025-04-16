package level_0;

import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = "*";

        for (int i = 1; i < 2 * n; i++) {
            if (i <= n) {
                System.out.println(s.repeat(i));
            } else {
                System.out.println(s.repeat(2 * n - i));
            }
        }
    }
}
