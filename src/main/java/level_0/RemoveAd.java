package level_0;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveAd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String myString = sc.nextLine();
        String[] strArr = myString.split(" ");

        System.out.println(Arrays.toString(solution(strArr)));
    }
    static String[] solution(String[] strArr) {
        String line = "";

        for (String str : strArr) {
            if (!str.contains("ad")) {
                line += str + " ";
            }
        }

        String[] answer = line.trim().split(" ");

        return answer;
    }
}
