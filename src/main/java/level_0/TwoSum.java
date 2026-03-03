package level_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class TwoSum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String a = st.nextToken();
        String b = st.nextToken();

        System.out.println(solution(a, b));
    }

    public static String solution(String a, String b) {
        BigInteger aBig = new BigInteger(a);
        BigInteger bBig = new BigInteger(b);
        return aBig.add(bBig).toString();
    }
}
