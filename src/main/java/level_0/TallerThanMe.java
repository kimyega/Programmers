package level_0;

import java.util.Scanner;

public class TallerThanMe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] parts = line.split(" ");

        int[] array = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            array[i] = Integer.parseInt(parts[i]);
        }
        int height = sc.nextInt();

        System.out.println(solution(array, height));
    }
    static int solution(int[] array, int height) {
        int answer = 0;
        for (int friend : array) {
            if (friend > height) {
                answer++;
            }
        }
        return answer;
    }
}
