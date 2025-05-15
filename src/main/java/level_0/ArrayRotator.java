package level_0;

import java.io.*;
import java.util.Arrays;

public class ArrayRotator {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] split = br.readLine().split(" ");
        int[] numbers = new int[split[0].length()];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(split[i]);
        }

        String direction = br.readLine();

        System.out.println(Arrays.toString(solution(numbers, direction)));
    }
    static int[] solution(int[] numbers, String direction) {

        int len = numbers.length;
        int[] answer = new int[numbers.length];
        int dir = direction.equals("right") ? 1 : -1;

        for (int i = 0; i < numbers.length; i++) {
            answer[i] = numbers[(i - dir + len) % len];
        }
        return answer;
    }
}
