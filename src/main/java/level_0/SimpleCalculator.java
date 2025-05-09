package level_0;

import java.util.Scanner;
import java.util.StringTokenizer;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binomial = sc.nextLine();

        System.out.println(solution(binomial));
    }
    static int solution(String binomial) {
        StringTokenizer st = new StringTokenizer(binomial);

        int a = Integer.parseInt(st.nextToken());
        char op = st.nextToken().charAt(0);
        int b = Integer.parseInt(st.nextToken());

        return op == '+' ? a + b : op == '-' ? a - b : a * b;
    }
}
