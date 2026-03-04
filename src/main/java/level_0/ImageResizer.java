package level_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ImageResizer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<String> list = new ArrayList<>();

        int k = Integer.parseInt(br.readLine());


        String line = "";

        while ((line = br.readLine()) != null) {
            list.add(line);
        }

        String[] picture = list.toArray(new String[0]);

        System.out.println(Arrays.toString(solution(picture, k)));
    }

    public static String[] solution(String[] picture, int k) {

        Deque<String> stack = new ArrayDeque<>();

        for (String p : picture) {
            StringBuilder resized = new StringBuilder();
            for (char c : p.toCharArray()) {
                resized.append(String.valueOf(c).repeat(k));
            }
            for (int i = 0; i < k; i++) {
                stack.add(resized.toString());
            }
        }

        return stack.toArray(new String[0]);
    }
}
