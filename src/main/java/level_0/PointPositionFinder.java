package level_0;

import java.util.Scanner;

public class PointPositionFinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] dot = new int[2];
        dot[0] = in.nextInt();
        dot[1] = in.nextInt();
        System.out.println(solution(dot));
    }
    static int solution(int[] dot) {
        int answer = 0;
        int x = dot[0];
        int y = dot[1];
        boolean isOne = x > 0 && y > 0;
        boolean isTwo = x < 0 && y > 0;
        boolean isThree = x < 0 && y < 0;

        if (isOne) {
            answer = 1;
        } else if (isTwo) {
            answer = 2;
        } else if (isThree) {
            answer = 3;
        } else {
            answer = 4;
        }
        return answer;
    }
}
