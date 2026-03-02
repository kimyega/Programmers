package level_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ConditionalString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        String ineq =  st.nextToken();
        String eq =  st.nextToken();

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        System.out.println(solution(ineq,eq,n,m));

    }

    public static int solution(String ineq, String eq, int n, int m) {

        boolean flag1 = ineq.equals("<") ? n < m : n > m;
        boolean flag2 = eq.equals("=") && n == m;

        return  flag1 || flag2 ? 1 : 0;
    }
}
