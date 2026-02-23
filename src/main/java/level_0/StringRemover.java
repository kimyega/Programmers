package level_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class StringRemover {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 문자열 입력
        String my_string = br.readLine();

        // indices 입력 (공백 구분)
        String[] input = br.readLine().split(" ");

        int[] indices = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            indices[i] = Integer.parseInt(input[i]);
        }

        System.out.println(solution(my_string, indices));
    }

    public static String solution(String my_string, int[] indices) {
        StringBuilder sb = new StringBuilder(my_string);
        Arrays.sort(indices);

        for (int i = indices.length - 1; i >= 0; i--) {
            sb.deleteCharAt(indices[i]);
        }
        return sb.toString();
    }
}
