package level_0;

import java.util.Scanner;

public class NumberManipulator1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String control = sc.nextLine();

        System.out.println(solution(n, control));
    }
    static int solution(int n, String control) {

        for (char c : control.toCharArray()) {
            n += c == 'w' ? 1 : c == 's' ? -1 : c == 'd' ? 10 : -10;
        }
        return n;
    }
}
