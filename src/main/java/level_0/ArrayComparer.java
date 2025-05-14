package level_0;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayComparer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] parts1 = sc.nextLine().split(" ");
        int[] arr1 = new int[parts1.length];

        for (int i = 0; i < parts1.length; i++) {
            arr1[i] = Integer.parseInt(parts1[i]);
        }

        String[] parts2 = sc.nextLine().split(" ");
        int[] arr2 = new int[parts2.length];

        for (int i = 0; i < parts2.length; i++) {
            arr2[i] = Integer.parseInt(parts2[i]);
        }

        System.out.println(Arrays.toString(solution(arr1, arr2)));

    }
    static int solution(int[] arr1, int[] arr2) {
        int answer = 0;

        if (arr1.length == arr2.length) {
            int sum1 = 0, sum2 = 0;

            for (int i = 0; i < arr1.length; i++) {
                sum1 += arr1[i];
                sum2 += arr2[i];
            }

            answer = Integer.compare(sum1, sum2);
        } else if (arr1.length > arr2.length) {
            answer = 1;
        } else {
            answer = -1;
        }

        return answer;
    }
}
