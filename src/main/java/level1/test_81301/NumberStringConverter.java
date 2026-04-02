package level1.test_81301;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

public class NumberStringConverter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        System.out.println(solution(s));
    }

    public static int solution(String s) {
        StringBuilder sb = new StringBuilder();

        Map<String, Integer> map = Map.of(
                "zero", 0,
                "one", 1,
                "two", 2,
                "three", 3,
                "four", 4,
                "five", 5,
                "six", 6,
                "seven", 7,
                "eight", 8,
                "nine", 9
        );

        StringBuilder word = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) sb.append(c);
            else {
                word.append(c);
                Integer num =  map.get(word.toString());
                if (num != null) {
                    sb.append(num);
                    word.setLength(0);
                }
            }
        }

        return Integer.parseInt(sb.toString());
    }
}
