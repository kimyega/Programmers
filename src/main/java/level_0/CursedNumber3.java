package level_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CursedNumber3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        System.out.println(solution(n));
    }

    public static int solution(int n) {

        int tnum = 0;

        for (int i = 1; i <= n; i++) {
            tnum++;
            while (tnum % 3 == 0 || (tnum + "").contains("3")) tnum++;
        }

        return tnum;
    }
}
