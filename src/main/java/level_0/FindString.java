package level_0;

import java.util.Scanner;

public class FindString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String myString = sc.nextLine();
        String pat = sc.nextLine();

    }
    static int solution(String myString, String pat) {
        boolean found = myString.matches("(?i).*" + pat + ".*");
        int answer = found ? 1 : 0;

        return answer;
    }
}
