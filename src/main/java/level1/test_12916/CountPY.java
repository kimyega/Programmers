package level1.test_12916;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountPY {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        System.out.println(solution(str));
    }

    public static boolean solution(String s) {
        int pCnt = 0, yCnt = 0;

        for (char c : s.toLowerCase().toCharArray()) {
            if (c == 'p') pCnt++;
            if (c == 'y') yCnt++;
        }
        return pCnt == yCnt;
    }
}
