package level_0;

import java.util.Arrays;
import java.util.Scanner;

public class MultipleChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] s2 = sc.nextLine().split(" ");
        int[] numlist = new int[s2.length];
        for (int i = 0; i < s2.length; i++) {
            numlist[i] = Integer.parseInt(s2[i]);
        }

        System.out.println(Arrays.toString(solution(n, numlist)));
    }
    static int[] solution(int n, int[] numlist) {
        int count = 0, index = 0;
        for (int num : numlist) {
            if (num % n == 0) {
                count++;
            }
        }

        int[] answer = new int[count];
        for (int num : numlist) {
            if (num % n == 0) {
                answer[count - 1] = num;
                count--;
            }
        }

        return answer;
    }
}
