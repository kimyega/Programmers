package level_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NextNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] common = new int[st.countTokens()];

        for (int i = 0; i < common.length; i++) {
            common[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(common));
    }

    public static int solution(int[] common) {
        int last = common[common.length - 1];

        int d1 = common[1] - common[0];
        int d2 = common[2] - common[1];

        if (d1 == d2) return last + d1;

        int ratio = common[1] / common[0];

        return  last * ratio;
    }
}
