package level1.test_67256;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class KeypadPressSolution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] numbers = new int[st.countTokens()];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        String hand =  br.readLine();

        System.out.println(solution(numbers, hand));
    }

    public static String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();

        int lPos = 10, rPos = 12;
        for (int nums : numbers) {
            int num = nums == 0 ? 11 : nums;

            char handUsed;

            switch (num) {
                case 1, 4, 7:
                    handUsed = 'L';
                    break;
                case 3, 6, 9:
                    handUsed = 'R';
                    break;
                default: {
                    int ld = getDist(lPos, num);
                    int rd = getDist(rPos, num);
                    if (ld < rd) handUsed = 'L';
                    else if (rd < ld) handUsed = 'R';
                    else handUsed = hand.equals("left") ? 'L' : 'R';
                }
            }

            if (handUsed == 'L') lPos = num;
            else rPos = num;

            sb.append(handUsed);
        }

        return sb.toString();
    }

    private static int getDist(int from, int to) {
        return Math.abs((from - 1) / 3 - (to - 1) / 3)
                + Math.abs((from - 1) % 3 - (to - 1) % 3);
    }
}
