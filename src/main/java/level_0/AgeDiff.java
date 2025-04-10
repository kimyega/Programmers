package level_0;

import java.util.Scanner;

public class AgeDiff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println(solution(age));

    }
    static int solution (int age) {
        int answer = 2023 - age;
        return answer;
    }
}
