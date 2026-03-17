package level_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

public class Babbling {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] babbing = br.readLine().split(" ");

        System.out.println(solution(babbing));
    }

    public static int solution(String[] babbling) {
        int answer = 0;

        for (String b : babbling) {
            Map<String, Boolean> map = new java.util.HashMap<>(Map.of("aya", false, "ye", false, "woo", false, "ma", false));
            String word = "";

            for (char c : b.toCharArray()) {
                word += c;
                if (map.containsKey(word) && !map.get(word)) {
                    map.put(word, true);
                    word = "";
                }
            }

            if (word.isEmpty()) answer++;
        }
        return answer;
    }
}
