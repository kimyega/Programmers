package level1.test_70128;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class DotProduct {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 배열 길이 입력
        int n1 = Integer.parseInt(br.readLine());

        // 정수 배열 입력
        int[] a = new int[n1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n1; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        // 배열 길이 입력
        int n2 = Integer.parseInt(br.readLine());

        // 정수 배열 입력
        int[] b = new int[n2];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n2; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(a, b));
    }

    public static int solution(int[] a, int[] b) {
        return IntStream.range(0, a.length).map(i -> a[i] * b[i]).sum();
    }
}
