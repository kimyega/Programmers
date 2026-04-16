package level1.test_42862;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class GymSuit {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] lost = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] reserve = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        System.out.println(solution(n, lost, reserve));
    }

    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        boolean[] isLost = new boolean[n];
        boolean[] hasReserve = new boolean[n];

        for (int l : lost) isLost[l - 1] = true;
        for (int r : reserve) hasReserve[r - 1] = true;

        for (int i = 0; i < n; i++) {
            if (isLost[i] && hasReserve[i]) {
                isLost[i] = false;
                hasReserve[i] = false;
            }
        }

        for (int i = 0; i < n; i++) {
            if (hasReserve[i]) {
                if (i > 0 && isLost[i - 1]) isLost[i - 1] = false;
                else if (i < n - 1 && isLost[i + 1]) isLost[i + 1] = false;
            }
        }

        for (int i = 0; i < n; i++) {
            if (!isLost[i]) answer++;
        }

        return answer;
    }
}
