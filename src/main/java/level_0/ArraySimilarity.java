package level_0;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ArraySimilarity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s1 = sc.nextLine().split(" ");
        String[] s2 = sc.nextLine().split(" ");

        System.out.println(solution(s1, s2));
    }
    static int solution(String[] s1, String[] s2) {
        int answer = 0;

        StringBuilder sb = new StringBuilder();
        for (String s : s1) {
            sb.append(s).append("|");
        }
        sb.deleteCharAt(sb.length() - 1);
        String regex = sb.toString();

        Pattern p = Pattern.compile(regex);

        for (String s : s2) {
            Matcher m = p.matcher(s);
            if (m.matches()) {
                answer++;
            }
        }

        return answer;
    }
}
