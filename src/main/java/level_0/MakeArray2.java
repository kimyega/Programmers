package level_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.StringTokenizer;

public class MakeArray2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int l = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        System.out.println(Arrays.toString(solution(l, r)));
    }

    public static int[] solution(int l, int r) {
        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = l; i <= r; i++) {
            boolean contains = true;
            int n = i;

            while (n > 0) {
                if (n % 10 != 5 && n % 10 != 0) {
                    contains = false;
                    break;
                }
                n /= 10;
            }

            if (contains) dq.add(i);
        }
        return dq.isEmpty() ? new int[] {-1} : dq.stream().mapToInt(x -> x).toArray();
    }
}
