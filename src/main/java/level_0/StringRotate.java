package level_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StringRotate {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String A = st.nextToken();
        String B = st.nextToken();

        System.out.println(solution(A,B));
    }

    public static int solution(String A, String B) {
        int count = -1, len =  A.length();
        String current = A;

        for (int i = 0; i <= len; i++) {
            if (current.equals(B)) {
                count = i;
                break;
            }

            current = current.charAt(len - 1) + current.substring(0, len - 1);
        }

        return count;
    }
}
