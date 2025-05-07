package level_0;

import java.util.Scanner;

public class FirstNegativeFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = sc.nextLine().split(" ");
        int[] num_list = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            num_list[i] = Integer.parseInt(words[i]);
        }

        System.out.println(solution(num_list));
    }
    static int solution(int[] num_list) {
        int answer = 0;
        boolean found = false;

        for (int num : num_list) {

            if (num < 0) {
                found = true;
                break;
            }

            answer++;
        }

        if (!found) {
            answer = -1;
        }
        return answer;
    }
}
