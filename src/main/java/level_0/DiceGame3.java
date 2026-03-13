package level_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class DiceGame3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        System.out.println(solution(a, b, c, d));
    }

    public static int solution(int a, int b, int c, int d) {
        int[] arr = {a, b, c, d};
        Arrays.sort(arr);

        if (arr[0] == arr[3]) return 1111 * arr[0];

        if (arr[0] == arr[2] || arr[1] == arr[3]) {
            int p = arr[1];
            int q = arr[0] == arr[2] ? arr[3] : arr[0];
            return (int) Math.pow(10 * p + q, 2);
        }

        if (arr[0] == arr[1] && arr[2] == arr[3]) return (arr[0] + arr[3]) * (arr[3] - arr[0]);

        if (arr[0] == arr[1]) return arr[2] * arr[3];
        if (arr[1] == arr[2]) return arr[0] * arr[3];
        if (arr[2] == arr[3]) return arr[0] * arr[1];

        return arr[0];
    }
}
