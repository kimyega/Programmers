package level_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SubstringCounter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String myString = br.readLine();
        String pat = br.readLine();

        System.out.println(solution(myString, pat));
    }

    public static int solution(String myString, String pat) {
        int answer = 0;

        while (myString.contains(pat)) {
            myString = myString.substring(myString.indexOf(pat) + 1);
            answer++;
        }

        return answer;
    }
}
