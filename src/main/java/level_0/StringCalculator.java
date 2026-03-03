package level_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StringCalculator {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String my_string = br.readLine();

        System.out.println(solution(my_string));
    }

    public static int solution(String my_string) {


        StringTokenizer st = new StringTokenizer(my_string);

        int answer = 0;
        boolean isPlus = true;

        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            if (token.equals("+")) {
                isPlus = true;
            } else if (token.equals("-")) {
                isPlus = false;
            } else {
                int num = Integer.parseInt(token);
                answer = isPlus ?  answer + num : answer - num;
            }
        }
        return answer;
    }
}
