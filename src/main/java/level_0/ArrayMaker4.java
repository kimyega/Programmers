package level_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class ArrayMaker4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));

        String[] str_arr = br.readLine().split(" ");

        int[] arr =  new int[str_arr.length];

        for (int i = 0; i < str_arr.length; i++) {
            arr[i] = Integer.parseInt(str_arr[i]);
        }

        System.out.println(Arrays.toString(solution(arr)));
    }

    public static int[] solution(int[] arr) {

        Deque<Integer> stack = new ArrayDeque<>();

        int idx = 0;
        while (idx < arr.length) {
            if (stack.isEmpty() || stack.peek() < arr[idx]) stack.push(arr[idx++]);
            else stack.pop();
        }

        return stack.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}
