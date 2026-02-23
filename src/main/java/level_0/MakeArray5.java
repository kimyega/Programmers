package level_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class MakeArray5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 문자열 배열 입력
        String[] intStrs = br.readLine().split(" ");

        // k s l 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        // solution 호출
        int[] result = solution(intStrs, k, s, l);

        // 결과 출력
        System.out.println(Arrays.toString(result));
    }

    public static int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<>();

        for (String intStr : intStrs) {
            int sub = Integer.parseInt(intStr.substring(s, s + l));
            if (sub > k) list.add(sub);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

}
