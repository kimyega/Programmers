package level1.test_12906;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class UniqueNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String[] str = br.readLine().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }

        System.out.println(Arrays.toString(solution(arr)));
    }

    public static int[] solution(int []arr) {
        if (arr.length == 0) return arr;

        Deque<Integer> stack = new ArrayDeque<>();
        stack.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] != arr[i]) stack.add(arr[i]);
        }

        return stack.stream().mapToInt(Integer::intValue).toArray();
    }
}
