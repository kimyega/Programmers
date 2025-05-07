package level_0;

import java.util.Scanner;

public class ArrayToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");

        System.out.println(solution(arr));

    }
    static String solution(String[] arr) {
        String answer = "";
        for (String s : arr) {
            answer += s;
        }
        return answer;
    }
}
