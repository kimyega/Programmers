package level_0;

import java.util.Scanner;

public class TriangleChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] sides = new int[3];
        for (int side : sides) {
            side = sc.nextInt();
        }

        System.out.println(solution(sides));
    }

    static int solution(int[] sides) {
        int answer = 0;
        int max = Math.max(sides[0], Math.max(sides[1], sides[2]));
        int minSum = sides[0] + sides[1] + sides[2] - max;
        if (max < minSum) {
            answer = 1;
        } else {
            answer = 2;
        }

        return answer;
    }
}
