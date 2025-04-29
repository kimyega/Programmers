package level_0;

import java.util.Arrays;
import java.util.Scanner;

public class MakeMax2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        String[] numbersStr = line.split(" ");
        int[] numbers = new int[numbersStr.length];

        for (int i = 0; i < numbersStr.length; i++) {
            numbers[i] = Integer.parseInt(numbersStr[i]);
        }

        System.out.println(solution(numbers));
    }
    static int solution(int[] numbers) {
        Arrays.sort(numbers);
        int answer = Math.max(numbers[0] * numbers[1], numbers[numbers.length - 1] * numbers[numbers.length - 2]);

        return answer;
    }
}
