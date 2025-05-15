package level_0;

import java.util.Scanner;
import java.util.stream.IntStream;

public class PizzaSharing2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(solution(n));
    }

    static int solution(int n) {
        int answer = IntStream.range(1, n + 1)
                .filter(i -> (6 * i) % n == 0)
                .findFirst()
                .getAsInt();

        return answer;
    }
}
