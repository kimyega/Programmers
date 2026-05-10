package level1.test_133502;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
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
        int count = 0;

        Stack<Integer> stack = new Stack<>();

        for (int x : ingredient) {
            stack.push(x);

            if (stack.size() >= 4) {
                int size = stack.size();

                if (stack.get(size - 1) == 1 &&
                    stack.get(size - 2) == 3 &&
                    stack.get(size - 3) == 2 &&
                    stack.get(size - 4) == 1) {

                    for (int i = 0; i < 4; i++) stack.pop();
                    count++;
                }
            }
        }

        return count;
    }
}
