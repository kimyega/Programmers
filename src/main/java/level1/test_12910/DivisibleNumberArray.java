package level1.test_12910;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class DivisibleNumberArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 배열 길이 입력
        int n = Integer.parseInt(br.readLine());

        // 정수 배열 입력
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int divisor = Integer.parseInt(br.readLine());


        System.out.println(Arrays.toString(solution(arr, divisor)));
    }

    public static int[] solution(int[] arr, int divisor) {
        int[] res = Arrays.stream(arr).filter(x -> x % divisor == 0).sorted().toArray();
        return res.length == 0 ? new int[]{-1} : res;
    }
}
