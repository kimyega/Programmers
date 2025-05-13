package level_0;

import java.util.Scanner;

public class StringTailHandler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str_list = sc.nextLine().split(" ");
        String ex = sc.nextLine();

        System.out.println(solution(str_list, ex));
    }
    static String solution(String[] str_list, String ex) {

        StringBuilder sb = new StringBuilder();

        for (String str : str_list) {
            if (!str.contains(ex)) {
                sb.append(str);
            }
        }

        return sb.toString();
    }
}
