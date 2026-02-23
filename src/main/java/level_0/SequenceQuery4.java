package level_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SequenceQuery4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1️⃣ arr 입력
        String[] arrStr = br.readLine().split(" ");
        int[] arr = new int[arrStr.length];
        for (int i = 0; i < arrStr.length; i++) arr[i] = Integer.parseInt(arrStr[i]);

        // 2️⃣ queries 입력 (마지막 줄까지 읽기)
        List<int[]> queryList = new ArrayList<>();
        String line;
        while ((line = br.readLine()) != null && !line.isEmpty()) {
            String[] qStr = line.split(" ");
            int[] q = new int[qStr.length];
            for (int i = 0; i < qStr.length; i++) q[i] = Integer.parseInt(qStr[i]);
            queryList.add(q);
        }

        int[][] queries = new int[queryList.size()][3];
        for (int i = 0; i < queryList.size(); i++) queries[i] = queryList.get(i);

        System.out.println(Arrays.toString(solution(arr, queries)));
    }

    public static int[] solution(int[] arr, int[][] queries) {
        for (int[] query : queries) {
            for (int j = query[0]; j <= query[1]; j++) {
                if (j % query[2] == 0) arr[j]++;
            }
        }
        return arr;
    }
}
