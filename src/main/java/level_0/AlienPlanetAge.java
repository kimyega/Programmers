package level_0;

import java.util.Scanner;

public class AlienPlanetAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        System.out.println(solution(age));
    }
    static String solution(int age) {

        String answer = String.valueOf(age).chars()
                .map(c -> c - '0' + 'a')
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        return answer;
    }
}
