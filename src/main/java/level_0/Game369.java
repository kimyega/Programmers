package level_0;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Game369 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int order = sc.nextInt();

        System.out.println(solution(order));
    }
    static int solution(int order) {
        int answer = 0;

        Pattern p = Pattern.compile("[369]");
        Matcher m = p.matcher(order + "");

        while (m.find()) {
            answer++;
        }

        return answer;
    }
}
