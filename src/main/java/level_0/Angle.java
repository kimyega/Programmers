package level_0;

import java.util.Scanner;

public class Angle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angle = sc.nextInt();
        System.out.println(solution(angle));

    }
    static int solution(int angle) {
        int answer = 0;
        if (angle < 90) {
            answer = 1;
        } else if (angle == 90) {
            answer = 2;
        } else if (angle < 180) {
            answer = 3;
        } else if (angle == 180) {
            answer = 4;
        }

        return answer;
    }
}
