package level_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class KNumberPicker {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str_arr =  br.readLine().split(" ");

        int[] arr = new int[str_arr.length];

        for (int i = 0; i < str_arr.length; i++) {
            arr[i] = Integer.parseInt(str_arr[i]);
        }

        int k = Integer.parseInt(br.readLine());

        System.out.println(Arrays.toString(solution(arr, k)));
    }

    public static int[] solution(int[] arr, int k) {

        Set<Integer> set = new LinkedHashSet<>();

        for (int j : arr) {
            set.add(j);
        }

        int[] answer = new int[k];

        for (int i = 0; i < k; i++) {
            if (!set.isEmpty()) {
                answer[i] = set.iterator().next();
                set.remove(answer[i]);
            } else answer[i] = -1;
        }

        return answer;
    }
}
