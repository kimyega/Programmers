package level_0;

import java.util.Scanner;

public class RnyString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String rny_string = sc.nextLine();

        System.out.println(solution(rny_string));
    }
    static String solution(String rny_string) {
        String answer = rny_string.replaceAll("m", "rn");
        return answer;
    }
}
