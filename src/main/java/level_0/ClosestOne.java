package level_0;

import java.util.Scanner;

public class ClosestOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arrStr = sc.nextLine().split(" ");
        int[] arr = new int[arrStr.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(arrStr[i]);
        }

        int idx = sc.nextInt();

        System.out.println(solution(arr, idx));
    }
    static int solution(int[] arr, int idx) {
        int answer = 0;
        boolean found = false;

        for (int i = idx; i < arr.length; i++) {
            if (arr[i] == 1) {
                found = true;
                answer = i;
                break;
            }
        }

        if (!found) {
            answer = -1;
        }
        return answer;
    }
}
