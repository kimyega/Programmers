package level_0;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class FractionAddition {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int numer1 = Integer.parseInt(st.nextToken());
        int denom1 =  Integer.parseInt(st.nextToken());
        int numer2 = Integer.parseInt(st.nextToken());
        int denom2 = Integer.parseInt(st.nextToken());

        System.out.println(Arrays.toString(solution(numer1, denom1, numer2, denom2)));
    }

    public static int[] solution(int numer1, int denom1, int numer2, int denom2) {


        int numer =  numer1 * denom2 + numer2 * denom1, denom = denom1 * denom2;

        int g = gcd(numer, denom);

        return new int[]{numer / g, denom / g};
    }

    private static int gcd(int a, int b) {
        while(b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
