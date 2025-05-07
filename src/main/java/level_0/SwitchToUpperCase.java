package level_0;

import java.util.Scanner;

public class SwitchToUpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String my_string = sc.nextLine();

        System.out.println(solution(my_string));
    }
    static String solution(String myString) {
        return myString.toUpperCase();
    }
}
