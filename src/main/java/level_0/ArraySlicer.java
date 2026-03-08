package level_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ArraySlicer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[st.countTokens()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int[] query =  new int[st.countTokens()];

        for (int i = 0; i < query.length; i++) {
            query[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(Arrays.toString(solution(arr, query)));
    }

    public static int[] solution(int[] arr, int[] query) {
        int start = 0, end = arr.length - 1;

        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) end = start + query[i];
            else start = start + query[i];
        }

        return Arrays.copyOfRange(arr, start, end + 1);
    }
}
