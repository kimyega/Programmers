package level_0;

import java.util.Arrays;
import java.util.Scanner;

public class CountBetweenX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String myString = sc.nextLine();

        System.out.println(Arrays.toString(solution(myString)));
    }
    static int[] solution(String myString) {
        String[] arr = myString.split("x", -1);
        int[] answer = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            answer[i] = arr[i].length();
        }
    return answer;
    }
}
