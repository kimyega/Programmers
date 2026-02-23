package level_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HiddenNumberSum2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String my_string = br.readLine();

        System.out.println(solution(my_string));
    }

    public static int solution(String my_string) {

        int sum = 0;

        for (String num : my_string.split("[^0-9]+")) {
            if (!num.isEmpty()) sum += Integer.parseInt(num);
        }

        return sum;
    }
}
