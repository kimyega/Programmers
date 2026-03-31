package level1.test_12940;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class GcdLcm {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        System.out.println(Arrays.toString(solution(n, m)));
    }

    public static int[] solution(int n, int m) {
        return new int[]{gcd(n, m), lcd(n, m)};
    }

    private static int gcd(int a, int b) {
        while (b !=  0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private static int lcd(int a, int b) {
        return a * b / gcd(a, b);
    }
}
