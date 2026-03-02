package level_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class MakeArray6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str_arr = br.readLine().split(" ");
        int[] arr = new int[str_arr.length];

        for (int i = 0; i < str_arr.length; i++) {
            arr[i] = Integer.parseInt(str_arr[i]);
        }

        System.out.println(Arrays.toString(solution(arr)));
    }

    public static int[] solution(int[] arr) {

        int idx = 0, len = arr.length;
        Deque<Integer> stack = new ArrayDeque<>();

        while (idx < len) {
            if (stack.isEmpty()) stack.push(arr[idx]);
            else if (stack.peek() == arr[idx]) stack.pop();
            else  stack.push(arr[idx]);

            idx++;
        }

        return !stack.isEmpty() ? stack.stream().mapToInt(x -> x).toArray() : new int[] {-1};
    }
}
