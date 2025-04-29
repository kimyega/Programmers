package level_0;

import java.util.Arrays;
import java.util.Scanner;

public class SortWords2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String my_string = sc.nextLine();

        System.out.println(solution(my_string));
    }
    static String solution(String my_string) {
        String answer = "";

        char[] my_char = my_string.toLowerCase().toCharArray();
        Arrays.sort(my_char);

        for (char c : my_char) {
            answer += c;
        }

        return answer;
    }
}
