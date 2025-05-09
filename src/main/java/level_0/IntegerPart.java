package level_0;

import java.util.Scanner;

public class IntegerPart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double flo = sc.nextDouble();

        System.out.println(solution(flo));
    }
    static int solution(double flo) {
        return (int) flo;
    }
}
