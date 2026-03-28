package level1.test_12943;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CollatzSequence {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        System.out.println(solution(num));
    }

    public static int solution(int num) {
        int answer = 0;
        long lNum = num;

        while (lNum != 1) {
            lNum = lNum % 2 == 0 ? lNum / 2 : lNum * 3 + 1;
            if (answer >= 500) return -1;
            answer++;
        }
        return answer;
    }
}
