package level1.test_133502;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class HamburgerMaker {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] ingredient = new int[st.countTokens()];

        for (int i = 0; i < ingredient.length; i++) {
            ingredient[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(ingredient));
    }

    public static int solution(int[] ingredient) {
        int answer = 0;

        int[] hamburger = {1, 2, 3, 1};
        int n = 0;
        boolean isHamburger = false;

        for (int i = 0; i < ingredient.length; i++) {
            if (ingredient[i] == ingredient[n]) {
                n++;
                isHamburger = true;
            }
        }
        return answer;
    }
}
