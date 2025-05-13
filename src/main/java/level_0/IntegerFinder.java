package level_0;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IntegerFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] parts = sc.nextLine().split(" ");
        int[] num_list = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            num_list[i] = Integer.parseInt(parts[i]);
        }

        int n = sc.nextInt();

        System.out.println(solution(num_list, n));
    }
    static int solution(int[] num_list, int n) {

        List<Integer> list = new ArrayList<>();
        for (int num : num_list) {
            list.add(num);
        }

        boolean contains = list.contains(n);
        return contains ? 1 : 0;
    }
}
