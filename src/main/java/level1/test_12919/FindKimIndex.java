package level1.test_12919;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindKimIndex {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] seoul = br.readLine().split(" ");

        System.out.println(solution(seoul));
    }

    public static String solution(String[] seoul) {
        int idx = -1;

        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                idx = i;
                break;
            }
        }
        return "김서방은 " + idx + "에 있다";
    }
}
