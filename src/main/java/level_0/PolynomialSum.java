package level_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PolynomialSum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String polynomial = br.readLine();

        System.out.println(solution(polynomial));
    }

    public static String solution(String polynomial) {
        StringTokenizer st = new StringTokenizer(polynomial);

        int xCnt = 0, cnt = 0;

        while (st.hasMoreTokens()) {
            String tkn = st.nextToken();
            if (tkn.equals("+")) continue;

            if (tkn.contains("x")) {
                String num = tkn.replace("x","");
                xCnt += num.isEmpty() ? 1 : Integer.parseInt(num);
            } else {
                cnt += Integer.parseInt(tkn);
            }
        }

        return (xCnt == 0 ? "" : xCnt == 1 ? "x" : xCnt + "x") + (cnt == 0 ? "" : xCnt == 0 ? cnt : " + " + cnt);
    }
}
