package level_0;

import java.util.Arrays;
import java.util.Scanner;

public class StringSplitterSorter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String myString = sc.nextLine();

        System.out.println(Arrays.toString(solution(myString)));
    }
    static String[] solution(String myString) {
        String[] answer = myString.split("x");
        Arrays.sort(answer);
        return answer;
    }
}
