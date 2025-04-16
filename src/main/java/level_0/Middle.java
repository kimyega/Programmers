package level_0;

import java.util.Arrays;
import java.util.Scanner;

public class Middle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] parts = line.split(" ");
        int[] array = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            array[i] = Integer.parseInt(parts[i]);
        }

        System.out.println(solution(array));
    }
    static int solution(int[] array) {
        Arrays.sort(array);
        int answer = array[(array.length - 1) / 2];
        return answer;
    }
}
