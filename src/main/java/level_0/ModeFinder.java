package level_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class ModeFinder {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] array = new int[st.countTokens()];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(array));
    }

    public static int solution(int[] array) {
        int answer = -1, max = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : array) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }


        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (max < entry.getValue()) {
                max = entry.getValue();
                answer = entry.getKey();
            } else if (max == entry.getValue()) {
                answer = -1;
            }
        }

        return answer;
    }
}
