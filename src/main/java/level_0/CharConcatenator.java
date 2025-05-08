package level_0;

import java.util.Scanner;

public class CharConcatenator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String my_string = sc.nextLine();

        String[] parts = my_string.split(" ");
        int[] index_list = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            index_list[i] = Integer.parseInt(parts[i]);
        }

        System.out.println(solution(my_string, index_list));
    }
    static String solution(String my_string, int[] index_list) {
        String answer = "";

        for (int index : index_list) {
            answer += my_string.charAt(index);
        }

        return answer;
    }
}
