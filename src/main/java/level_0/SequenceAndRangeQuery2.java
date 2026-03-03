package level_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class SequenceAndRangeQuery2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // 1️⃣ 배열 입력 (첫 줄)
        st = new StringTokenizer(br.readLine());
        List<Integer> arrList = new ArrayList<>();
        while (st.hasMoreTokens()) {
            arrList.add(Integer.parseInt(st.nextToken()));
        }

        int[] arr = arrList.stream().mapToInt(i -> i).toArray();

        // 2️⃣ 쿼리 입력 (EOF까지)
        List<int[]> queryList = new ArrayList<>();

        String line;
        while ((line = br.readLine()) != null && !line.isEmpty()) {
            st = new StringTokenizer(line);
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            queryList.add(new int[]{l, r, k});
        }

        int[][] queries = queryList.toArray(new int[0][]);

        // 3️⃣ 실행
        int[] result = solution(arr, queries);
        System.out.println(Arrays.toString(result));
    }

    public static int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];

        int idx = 0;
        for (int[] query : queries) {
            int min = Integer.MAX_VALUE;
            boolean flag = false;

            for (int i = query[0]; i <= query[1]; i++) {
                if (arr[i] > query[2]) {
                    min = Math.min(min, arr[i]);
                    flag = true;
                }
            }

            answer[idx++] = flag ? min : -1;
        }

        return answer;
    }
}
