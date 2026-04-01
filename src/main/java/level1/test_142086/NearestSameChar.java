package level1.test_142086;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NearestSameChar {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        System.out.println(Arrays.toString(solution(s)));
    }

    public static int[] solution(String s) {
        int[] answer = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            int lastIdx = s.lastIndexOf(s.charAt(i), i - 1);
            int prevIndex = lastIdx != -1 ? lastIdx : i + 1;
            answer[i] = i - prevIndex;
        }

        return answer;
    }
}
