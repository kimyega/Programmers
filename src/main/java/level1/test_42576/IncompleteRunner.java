package level1.test_42576;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class IncompleteRunner {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] participant = br.readLine().split(" ");
        String[] completion = br.readLine().split(" ");

        System.out.println(solution(participant, completion));
    }

    public static String solution(String[] participant, String[] completion) {

        Map<String, Integer> map = new HashMap<>();

        for (String p : participant) {
            map.put(p, map.getOrDefault(p, 0) + 1);
        }

        for (String c : completion) {
            map.put(c, map.get(c) - 1);
        }

        for (String key : map.keySet()) {
            if (map.get(key) != 0) return key;
        }

        return "";
    }
}
