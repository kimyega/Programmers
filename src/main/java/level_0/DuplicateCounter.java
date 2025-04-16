package level_0;

import java.util.Scanner;

public class DuplicateCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");

        int[] array = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            array[i] = Integer.parseInt(arr[i]);
        }

        int n= Integer.parseInt(sc.nextLine());

        System.out.println(solution(array, n));
    }
    static int solution(int[] array, int n) {
        int answer = 0;
        for (int num : array) {
            if (num == n) {
                answer++;
            }
        }
        return answer;
    }
}
