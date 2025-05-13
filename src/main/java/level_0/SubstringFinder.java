package level_0;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SubstringFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String myString = sc.nextLine();
        String pat = sc.nextLine();

        System.out.println(solution(myString, pat));
    }
    static int solution(String myString, String pat) {

        StringBuilder sb = new StringBuilder();

        for (char c : myString.toCharArray()) {
            if (c == 'A') sb.append("B");
            else sb.append("A");
        }

        String regex = pat;
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(sb.toString());

        return m.find() ? 1 : 0;
    }
}
