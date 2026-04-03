package level1.test_176963;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class MemoryScore {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // name 개수
        int n = Integer.parseInt(br.readLine());

        String[] name = br.readLine().split(" ");
        int[] yearning = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            yearning[i] = Integer.parseInt(st.nextToken());
        }

        // photo 개수
        int m = Integer.parseInt(br.readLine());

        String[][] photo = new String[m][];

        for (int i = 0; i < m; i++) {
            photo[i] = br.readLine().split(" ");
        }

        int[] result = solution(name, yearning, photo);

        for (int r : result) {
            System.out.print(r + " ");
        }
    }

    public static int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }

        for (int i = 0; i < photo.length; i++) {
            for (String person : photo[i]) {
                if (map.containsKey(person)) answer[i] += map.get(person);
            }
        }

        return answer;
    }
}
