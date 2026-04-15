package level1.test_77484;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class LottoRankSummary {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] lottos = new int[6];
        int[] win_nums = new int[6];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 6; i++) {
            lottos[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 6; i++) {
            win_nums[i] = Integer.parseInt(st.nextToken());
        }

        int[] result = solution(lottos, win_nums);

        System.out.println(Arrays.toString(result));
    }

    public static int[] solution(int[] lottos, int[] win_nums) {

        int zCnt = 0, cCnt = 0;

        Arrays.sort(lottos);
        Arrays.sort(win_nums);

        for (int lotto : lottos) {
            if (lotto == 0) {
                zCnt++;
                continue;
            }
            for (int winNum : win_nums) {
                if (lotto == winNum) {
                    cCnt++;
                    break;
                }
            }
        }

        int best = cCnt + zCnt;
        int worst = cCnt;

        return new int[]{
                rank(best),
                rank(worst)
        };
    }

    static int rank(int x) {
        if (x == 0) return 6;
        return 7 - x;
    }
}
