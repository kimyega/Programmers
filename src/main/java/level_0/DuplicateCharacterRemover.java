package level_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DuplicateCharacterRemover {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String my_string = bufferedReader.readLine();

        System.out.println(solution(my_string));
    }

    public static String solution(String my_string) {
        StringBuilder sb = new StringBuilder();

        for (char c : my_string.toCharArray()) {
            if (sb.indexOf(String.valueOf(c)) == -1) sb.append(c);
        }

        return sb.toString();
    }
}
