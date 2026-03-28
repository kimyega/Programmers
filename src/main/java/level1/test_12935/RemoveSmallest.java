package level1.test_12935;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.StringTokenizer;

public class RemoveSmallest {
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

        System.out.println(Arrays.toString(solution(arr)));
    }

    public static int[] solution(int[] arr) {
        int min = Integer.MAX_VALUE;
        Deque<Integer> stack = new ArrayDeque<>();

        for (int num : arr) {
            stack.add(num);
            min = Math.min(min, num);
        }

        stack.remove(min);
        int[] res = stack.stream().mapToInt(x -> x).toArray();

        return res.length == 0 ? new int[] {-1} : res;
    }
}
