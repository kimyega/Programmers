package level_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class AtoB {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String before = br.readLine();
        String after = br.readLine();

        System.out.println(solution(before, after));
    }

    public static int solution(String before, String after) {

        Map<Character, Integer> bMap = new HashMap<>();
        Map<Character, Integer> aMap = new HashMap<>();

        for (int i = 0; i < before.length(); i++) {
            bMap.put(before.charAt(i), bMap.getOrDefault(before.charAt(i), 0) + 1);
            aMap.put(after.charAt(i), aMap.getOrDefault(after.charAt(i), 0) + 1);
        }

        return bMap.equals(aMap) ? 1 : 0;
    }
}
