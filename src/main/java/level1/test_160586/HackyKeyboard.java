package level1.test_160586;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HackyKeyboard {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] keymap = br.readLine().split(" ");
        String[] targets = br.readLine().split(" ");

        System.out.println(Arrays.toString(solution(keymap, targets)));
    }

    public static int[] solution(String[] keymap, String[] targets) {

        Map<Character, Integer> map = new HashMap<>();

        for (String key : keymap) {
            for (int i = 0; i < key.length(); i++) {
                char c = key.charAt(i);
                map.put(c, Math.min(map.getOrDefault(c, Integer.MAX_VALUE), i + 1));
            }
        }

        int[] result = new int[targets.length];

        for (int i = 0; i < targets.length; i++) {
            int count = 0;
            for (char c : targets[i].toCharArray()) {
                if (!map.containsKey(c)){
                    count = -1;
                    break;
                }
                count += map.get(c);
            }
            result[i] = count == 0 ? -1 : count;
        }

        return result;
    }
}
