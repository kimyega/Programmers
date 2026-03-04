package level_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StringOverlay {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String my_string = st.nextToken();
        String overwrite_string =  st.nextToken();

        int s = Integer.parseInt(br.readLine());

        System.out.println(solution(my_string, overwrite_string, s));
    }

    public static String solution(String my_string, String overwrite_string, int s) {
        return new StringBuilder(my_string).replace(s, s + overwrite_string.length(), overwrite_string).toString();
    }
}
