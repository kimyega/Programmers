package level_0;

import java.util.Scanner;

public class JoinNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] words = line.split(" ");

        int[] num_list = new int[words.length];

        for (int i = 0; i < words.length; i++) {
            num_list[i] = Integer.parseInt(words[i]);
        }

        System.out.println(solution(num_list));
    }
    static int solution(int[] num_list) {
        String ps = "", os = "";

        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                ps += num_list[i];
            } else {
                os += num_list[i];
            }
        }

        int answer = Integer.parseInt(ps) + Integer.parseInt(os);

        return answer;
    }
}
