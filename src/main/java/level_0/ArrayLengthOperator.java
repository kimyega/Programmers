package level_0;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayLengthOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] parts = sc.nextLine().split(" ");
        int[] arr = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            arr[i] = Integer.parseInt(parts[i]);
        }

        int n = sc.nextInt();

        System.out.println(Arrays.toString(solution(arr, n)));

    }
    static int[] solution(int[] arr, int n) {
        int start = arr.length % 2 == 0 ? 1 : 0;

        for (int i = start; i < arr.length; i += 2) {
            arr[i] += n;
        }
        return arr;
    }
}
