package level_0;

import java.util.Arrays;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] todo_list = sc.nextLine().split(" ");
        boolean[] finished = new boolean[todo_list.length];

        for (int i = 0; i < finished.length; i++) {
            finished[i] = sc.nextBoolean();
        }

        System.out.println(Arrays.toString(solution(todo_list, finished)));
    }
    static String[] solution(String[] todo_list, boolean[] finished) {
        int count = 0, idx = 0;

        for (boolean b : finished) {
            if (!b) {
                count++;
            }
        }

        String[] answer = new String[count];

        for (int i = 0; i < todo_list.length; i++) {
            if (!finished[i]) {
                answer[idx] = todo_list[i];
                idx++;
            }
        }

        return answer;
    }
}
