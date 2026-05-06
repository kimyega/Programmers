package level1.test_72410;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoreNova {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String new_id = br.readLine();

        System.out.println(solution(new_id));
    }

    public static String solution(String new_id) {
        String answer = new_id;

        answer = answer
                .toLowerCase()
                .replaceAll("[^a-z0-9._-]", "")
                .replaceAll("\\.+", ".")
                .replaceAll("^\\.|\\.$", "");

        if (answer.isEmpty()) answer = "a";
        if (answer.length() >= 16) answer = answer.substring(0, 15).replaceAll("^\\.|\\.$", "");

        while (answer.length() < 3) {
            answer += answer.charAt(answer.length() - 1);
        }

        return answer;
    }
}
