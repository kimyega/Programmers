package level_0;

import java.util.Scanner;

public class ArrAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] str = line.split(" ");

        int[] numbers = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            numbers[i] = Integer.parseInt(str[i]);
        }

        System.out.println(solution(numbers));
    }
    static double solution(int[] numbers) {
        double answer = 0;
        for (int num : numbers) {
            answer += num;
        }
        answer /= numbers.length;

        return answer;
    }
}
