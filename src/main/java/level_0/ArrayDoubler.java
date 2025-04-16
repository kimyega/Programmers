package level_0;

import java.util.Scanner;

public class ArrayDoubler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] numbers = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            numbers[i] = Integer.parseInt(str.substring(i, i + 1));
        }

        System.out.println(solution(numbers));
    }
    static int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            answer[i] = numbers[i] * 2;
        }

        return answer;
    }
}
