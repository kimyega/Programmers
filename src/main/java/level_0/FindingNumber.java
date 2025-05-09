package level_0;

import java.util.Scanner;

public class FindingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(solution(num, k));
    }
    static int solution(int num, int k) {
        int digit = 0;
        boolean flag = false;
        String numStr = String.valueOf(num);

        for (char c : numStr.toCharArray()) {
            digit++;

            if (c - '0' == k) {
                flag = true;
                break;
            }
        }

        return flag ? digit : -1;
    }
}
