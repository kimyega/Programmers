package level1.test_76501;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class SignedSum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 배열 길이 입력
        int n = Integer.parseInt(br.readLine());

        // 정수 배열 입력
        int[] absolutes = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            absolutes[i] = Integer.parseInt(st.nextToken());
        }

        // boolean 배열 입력
        boolean[] signs = new boolean[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            signs[i] = Boolean.parseBoolean(st.nextToken());
        }

        // solution 호출
        int result = solution(absolutes, signs);

        // 결과 출력
        System.out.println(result);
    }

    public static int solution(int[] absolutes, boolean[] signs) {
        return IntStream.range(0, absolutes.length).map(i -> signs[i] ? absolutes[i] : -absolutes[i]).sum();
    }
}
