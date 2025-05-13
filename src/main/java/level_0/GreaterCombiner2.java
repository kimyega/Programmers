package level_0;

import java.util.Scanner;

public class GreaterCombiner2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(solution(a, b));
    }
    static int solution(int a, int b) {

        int al = String.valueOf(a).length();
        int bl = String.valueOf(b).length();

        int combA = a + b * (int) Math.pow(10, al);
        int combB = b + a * (int) Math.pow(10, bl);

        return Math.max(combA, combB);
    }
}
