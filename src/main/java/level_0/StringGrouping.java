package level_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StringGrouping {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] strArr = br.readLine().split(" ");

        System.out.println(solution(strArr));
    }

    public static int solution(String[] strArr) {
        int[] count = new int[31];
        int max = 0;

        for (String str : strArr) {
            int len = str.length();
            count[len]++;
            max  = Math.max(max, count[len]);
        }

        return max;
    }
}
