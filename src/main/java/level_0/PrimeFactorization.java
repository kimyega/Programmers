package level_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class PrimeFactorization {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        System.out.println(Arrays.toString(solution(n)));
    }

    public static int[] solution(int n) {
        Set<Integer> set = new LinkedHashSet<>();

        while (n != 1) {

            for (int i = 2; i <= n; i++) {
                if (n % i == 0) {
                    set.add(i);
                    n /= i;
                    break;
                }
            }
        }

        return set.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}
