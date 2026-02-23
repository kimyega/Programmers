package level_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class SequenceRangeQuery3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;

        // 1️⃣ 배열 입력
        st = new StringTokenizer(br.readLine());
        List<Integer> arrList = new ArrayList<>();

        while (st.hasMoreTokens()) {
            arrList.add(Integer.parseInt(st.nextToken()));
        }

        int[] arr = arrList.stream().mapToInt(i -> i).toArray();

        // 2️⃣ 쿼리 입력 (끝까지 읽기)
        List<int[]> queryList = new ArrayList<>();
        String line;

        while ((line = br.readLine()) != null && !line.isEmpty()) {
            st = new StringTokenizer(line);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            queryList.add(new int[]{a, b});
        }

        int[][] queries = queryList.toArray(new int[0][0]);


    }

    public static int[] solution(int[] arr, int[][] queries) {

        for (int[] query : queries) {
            int a = query[0];
            int b = query[1];

            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }

        return arr;
    }
}
