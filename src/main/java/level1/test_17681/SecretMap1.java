package level1.test_17681;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SecretMap1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr1[i] = Integer.parseInt(st1.nextToken());
        }

        for (int i = 0; i < n; i++) {
            arr2[i] = Integer.parseInt(st2.nextToken());
        }

        String[] result = solution(n, arr1, arr2);

        for (String s : result) {
            System.out.println(s);
        }

    }

    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            int num = arr1[i] | arr2[i];

            StringBuilder sb = new StringBuilder();

            for (int j = n - 1; j >= 0; j--) {
                if ((num & (1 << j)) != 0) {
                    sb.append("#");
                } else {
                    sb.append(" ");
                }
            }

            answer[i] = sb.toString();
        }

        return answer;
    }
}
