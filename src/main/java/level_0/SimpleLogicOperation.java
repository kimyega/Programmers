package level_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SimpleLogicOperation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        boolean x1 = Boolean.parseBoolean(st.nextToken());
        boolean x2 = Boolean.parseBoolean(st.nextToken());
        boolean x3 = Boolean.parseBoolean(st.nextToken());
        boolean x4 = Boolean.parseBoolean(st.nextToken());

        System.out.println(solution(x1, x2, x3, x4));
    }

    public static boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        return (x1 || x2) && (x3 || x4);
    }
}
