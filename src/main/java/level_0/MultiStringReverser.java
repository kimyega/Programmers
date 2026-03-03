package level_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class MultiStringReverser {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1. 문자열 입력
        String my_string = br.readLine();

        // 2. queries를 담을 리스트
        List<int[]> list = new ArrayList<>();

        String line;

        // 3. 입력 끝날 때까지 받기
        while ((line = br.readLine()) != null && !line.isEmpty()) {
            StringTokenizer st = new StringTokenizer(line);

            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            list.add(new int[]{start, end});
        }

        // 4. List → int[][] 변환
        int[][] queries = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            queries[i] = list.get(i);
        }

        System.out.println(solution(my_string, queries));
    }

    public static String solution(String my_string, int[][] queries) {
        StringBuilder sb;

        for (int[] query : queries) {
            sb = new StringBuilder(my_string.substring(0, query[0]));
            sb.append(new StringBuilder(my_string.substring(query[0], query[1] + 1)).reverse());
            sb.append(my_string.substring(query[1] + 1));
            my_string = sb.toString();
        }

        return my_string;
    }
}
