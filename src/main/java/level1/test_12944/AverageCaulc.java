package level1.test_12944;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class AverageCaulc {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str_arr =  br.readLine().split(" ");

        int[] arr =  new int[str_arr.length];
        for (int i = 0; i < str_arr.length; i++) {
            arr[i] = Integer.parseInt(str_arr[i]);
        }


        System.out.println(solution(arr));
    }

    public static double solution(int[] arr) {
        return Arrays.stream(arr).mapToDouble(x -> x).average().orElse(0.0);
    }
}
