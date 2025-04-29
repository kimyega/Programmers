package level_0;

import java.util.Scanner;

public class BacterialGrowth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        System.out.println(solution(n, t));
    }
    static int solution(int n, int t) {
        return n * (int) Math.pow(2, t);
    }
}
