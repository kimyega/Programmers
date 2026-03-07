package level_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SpecialSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] num_str = br.readLine().split(" ");
        int[] numlist = new int[num_str.length];
        for (int i = 0; i < num_str.length; i++) {
            numlist[i] = Integer.parseInt(num_str[i]);
        }

        int n = numlist.length;

        System.out.println(Arrays.toString(solution(numlist, n)));
    }

    public static int[] solution(int[] numlist, int n) {

        Integer[] arr  = Arrays.stream(numlist)
                .boxed()
                .toArray(Integer[]::new);

        Arrays.sort(arr, (a, b) -> {
            int diff = Math.abs(a - n) - Math.abs(b - n);
            if (diff == 0) return b - a;
           return diff;
        });

        return Arrays.stream(arr).mapToInt(Integer::intValue).toArray();
    }
}
