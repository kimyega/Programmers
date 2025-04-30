package level_0;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class CaseTranseInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strArr = sc.nextLine().split(" ");

        System.out.println(Arrays.toString(solution(strArr)));
    }
    static String[] solution(String[] strArr) {
        String line = "";

        for (int i = 0; i < strArr.length; i++) {
            if (i % 2 == 0) {
                line += strArr[i].toLowerCase();
            } else {
                line += strArr[i].toUpperCase();
            }

            line += " ";
        }

        String[] answer = line.trim().split(" ");

        return answer;
    }
}
