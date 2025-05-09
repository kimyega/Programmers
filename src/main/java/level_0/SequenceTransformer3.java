package level_0;

import java.util.Arrays;
import java.util.Scanner;

public class SequenceTransformer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int[] arr = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        int k = sc.nextInt();

        System.out.println(Arrays.toString(solution(arr, k)));
    }
    static int[] solution(int[] arr, int k) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] = k % 2 == 0 ? arr[i] + k : arr[i] * k;
        }
        return arr;
    }
}
