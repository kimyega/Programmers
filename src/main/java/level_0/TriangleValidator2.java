package level_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TriangleValidator2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str_arr =  br.readLine().split(" ");

        int[] sides = new int[str_arr.length];

        for (int i = 0; i < str_arr.length; i++) {
            sides[i] = Integer.parseInt(str_arr[i]);
        }

        System.out.println(solution(sides));
    }

    public static int solution(int[] sides) {
        int max = Math.max(sides[0], sides[1]), count = 0;

        for (int i = 1; i < sides[0] + sides[1]; i++) {
            max = Math.max(max, i);
            int sum = sides[0] + sides[1] + i;
            if (2 * max < sum) count++;
        }

        return count;
    }
}
