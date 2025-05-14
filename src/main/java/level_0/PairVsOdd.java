package level_0;

import java.util.Scanner;

public class PairVsOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] parts = sc.nextLine().split(" ");
        int[] num_list = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            num_list[i] = Integer.parseInt(parts[i]);
        }

        System.out.println(solution(num_list));
    }
    static int solution(int[] num_list) {
        int pair = 0, odd = 0;

        for (int i = 0; i < num_list.length; i++) {
            if ((i + 1) % 2 == 0) {
                pair += num_list[i];
            } else {
                odd += num_list[i];
            }
        }
        return Math.max(pair, odd);
    }
}
