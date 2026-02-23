package level_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SequenceRangeQuery1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // arr 입력
        String[] arrInput = br.readLine().split(" ");
        int[] arr = new int[arrInput.length];

        for (int i = 0; i < arrInput.length; i++) {
            arr[i] = Integer.parseInt(arrInput[i]);
        }

        // queries 개수 입력
        int q = Integer.parseInt(br.readLine());

        int[][] queries = new int[q][2];

        for (int i = 0; i < q; i++) {
            String[] queryInput = br.readLine().split(" ");
            queries[i][0] = Integer.parseInt(queryInput[0]);
            queries[i][1] = Integer.parseInt(queryInput[1]);
        }

        System.out.println(Arrays.toString(solution(arr, queries)));
    }

    public static int[] solution(int[] arr, int[][] queries) {

        for (int[] query : queries) {
            for (int j = query[0]; j <= query[1]; j++) {
                arr[j]++;
            }
        }

        return arr;
    }
}
