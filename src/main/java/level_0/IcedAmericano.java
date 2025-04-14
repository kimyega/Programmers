package level_0;

import java.util.Arrays;
import java.util.Scanner;

public class IcedAmericano {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        System.out.println(Arrays.toString(solution(money)));
    }
    static int[] solution(int money) {
        int[] answer = new int[2];
        answer[0] = money / 5500;
        answer[1] = money % 5500;
        return answer;
    }
}
