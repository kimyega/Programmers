package level1.test_133499;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BabblingChecker {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] babbling =  br.readLine().split(" ");

        System.out.println(solution(babbling));
    }

    public static int solution(String[] babbling) {
        int answer = 0;

        String[] words = {"aya", "ye", "woo", "ma"};

        for (String s : babbling) {
            String temp = s;

            for (String word : words) {
                if (temp.contains(word + word)) {
                    temp = "1";
                    break;
                }
                temp = temp.replace(word, " ");
            }

            if (temp.trim().isEmpty()) answer++;
        }
        return answer;
    }
}
