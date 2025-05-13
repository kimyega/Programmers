package level_0;

import java.util.Scanner;

public class ContainsSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String my_string = sc.nextLine();
        String target = sc.nextLine();

        System.out.println(solution(my_string, target));
    }
    static int solution(String my_string, String target) {
        return my_string.contains(target) ? 1 : 0;
    }
}
