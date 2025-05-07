package level_0;

import java.util.Scanner;

public class AddUntilOverN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        int[] numbers = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            numbers[i] = Integer.parseInt(arr[i]);
        }

        int n = sc.nextInt();

        System.out.println(solution(numbers, n));
    }
    static int solution(int[] numbers, int n) {
        int answer = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (answer > n) break;
            answer += numbers[i];
        }
        return answer;
    }
}
