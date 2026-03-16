package level_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ParallelDetector {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] dots = new int[4][2];

        for (int i = 0; i < 4; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            dots[i][0] = Integer.parseInt(st.nextToken()); // x
            dots[i][1] = Integer.parseInt(st.nextToken()); // y
        }

        System.out.println(solution(dots));
    }

    public static int solution(int[][] dots) {

        if (isParallel(dots[0], dots[1],  dots[2], dots[3])) return 1;
        if (isParallel(dots[0], dots[2],  dots[1], dots[3])) return 1;
        if (isParallel(dots[0], dots[3],  dots[1], dots[2])) return 1;

        return 0;
    }

    public static boolean isParallel(int[] a,  int[] b, int[] c, int[] d) {
        return (b[1] - a[1]) * (d[0] - c[0]) == (d[1] - c[1]) * (b[0] - a[0]);
    }
}
