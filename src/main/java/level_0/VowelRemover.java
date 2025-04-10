package level_0;

import java.util.Scanner;

public class VowelRemover {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String my_string = sc.nextLine();
        System.out.println(solution(my_string));

    }
    static String solution (String my_string) {
        String answer = "";
        answer = my_string.replaceAll("[aeiou]", "");
        return answer;
    }
}
