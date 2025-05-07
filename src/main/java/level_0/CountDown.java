package level_0;

import java.util.Arrays;
import java.util.Scanner;

public class CountDown {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int start_num = sc.nextInt();
        int end_num = sc.nextInt();

        System.out.println(Arrays.toString(solution(start_num, end_num)));
    }
    static int[] solution(int start_num, int end_num) {
        int[] answer = new int[start_num - end_num + 1];

        for (int i = start_num; i >= end_num; i--) {
            answer[start_num - i] = i;
        }
        return answer;
    }
}
