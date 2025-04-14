package level_0;

import java.util.Scanner;

public class CharacterRemover {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String my_string = sc.nextLine();
        String letter = sc.nextLine();
        System.out.println(solution(my_string, letter));
    }
    static String solution(String my_string, String letter) {
        String answer = my_string.replaceAll(letter, "");
        return answer;
    }
}
