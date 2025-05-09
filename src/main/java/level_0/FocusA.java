package level_0;

import java.util.Scanner;

public class FocusA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String myString = sc.nextLine();

        System.out.println(solution(myString));
    }
    static String solution(String myString) {
        return myString.toLowerCase().replaceAll("a", "A");
    }
}
