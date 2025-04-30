package level_0;

import java.util.Arrays;
import java.util.Scanner;

public class SplitWithBlank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String my_string = sc.nextLine();

        System.out.println(Arrays.toString(solution(my_string)));
    }
    static String[] solution(String my_string) {
        String[] answer = my_string.trim().split("\\s+");
        return answer;
    }
}
