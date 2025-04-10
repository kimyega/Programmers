package level_0;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySplitter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] words = line.split(" ");
        int[] numbers = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            numbers[i] = Integer.parseInt(words[i]);
        }
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println(Arrays.toString(solution(numbers, num1, num2)));

    }
    static int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = numbers[num1 + i];
        }
        return answer;
    }
}
