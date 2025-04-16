package level_0;

import java.util.Arrays;
import java.util.Scanner;

public class MultipleSelector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String line = sc.nextLine();
        String[] parts = line.split(" ");

        int[] numlist = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            numlist[i] = Integer.parseInt(parts[i]);
        }

        System.out.println(Arrays.toString(solution(n, numlist)));

    }
    static int[] solution(int n, int[] numlist) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                sb.append(numlist[i]).append(" ");
            }
        }

        String line = sb.toString().trim();

        if (line.isEmpty()) {
            return new int[0];
        }

        String[] parts = line.split(" ");
        int[] answer = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            answer[i] = Integer.parseInt(parts[i]);
        }

        return answer;
    }
}
