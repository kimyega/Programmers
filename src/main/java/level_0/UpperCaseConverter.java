package level_0;

import java.util.Scanner;

public class UpperCaseConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String myString = sc.nextLine();
        String alp = sc.nextLine();

        System.out.println(solution(myString, alp));
    }
    static String solution(String my_string, String alp) {
        return my_string.replaceAll(alp, alp.toUpperCase());
    }
}
