package level_0;

import java.util.Arrays;
import java.util.Scanner;

public class SortString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String my_string = sc.nextLine();

        System.out.println(Arrays.toString(solution(my_string)));
    }
    static int[] solution(String my_string) {
        int[] digits = new int[my_string.length()];
        int count = 0;

        for (char c : my_string.toCharArray()) {
            if (Character.isDigit(c)) {
                digits[count] = c - '0';
                count++;
            }
        }

        int[] answer = new int[count];
        System.arraycopy(digits, 0, answer, 0, count);

        Arrays.sort(answer);

        return answer;
    }
}
