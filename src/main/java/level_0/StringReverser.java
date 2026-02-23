package level_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StringReverser {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String my_string = br.readLine();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int s =  Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());

        System.out.println(solution(my_string, s, e));
    }

    public static String solution(String my_string, int s, int e) {
        StringBuilder sb = new StringBuilder(my_string);
        return sb.replace(s, e + 1, new StringBuilder(my_string.substring(s, e + 1)).reverse().toString()).toString();
    }
}
