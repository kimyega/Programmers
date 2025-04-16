package level_0;

import java.util.Scanner;

public class Ant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hp = sc.nextInt();
        System.out.println(solution(hp));
    }
    static int solution(int hp) {
        return hp / 5 + hp % 5 / 3 + hp % 5 % 3;
    }
}
