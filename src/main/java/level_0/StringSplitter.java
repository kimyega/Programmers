package level_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class StringSplitter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String my_str =  br.readLine();
        int n = Integer.parseInt(br.readLine());

        System.out.println(Arrays.toString(solution(my_str,n)));
    }

    public static String[] solution(String my_str, int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < my_str.length(); i++) {
            sb.append(my_str.charAt(i));
            if ((i + 1) % n == 0) sb.append(" ");
        }

        return sb.toString().split(" ");
    }
}
