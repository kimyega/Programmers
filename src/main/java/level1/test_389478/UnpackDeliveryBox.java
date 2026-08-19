package level1.test_389478;

import java.util.Scanner;

public class UnpackDeliveryBox {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int w = sc.nextInt();
        int num = sc.nextInt();

        int result = solution(n, w, num);

        System.out.println(result);

        sc.close();
    }

    public static int solution(int n, int w, int num) {
        int answer = 0;

        int top = (int) Math.ceil((double) n / w);
        int[][] arr = new int[top][w];
        int num_tp = 0;


        for (int i = 0; i < n; i++) {
            int dir = i / w % 2 != 0 ? i % w : w - 1 - i % w;
            arr[i / w][dir] = i + 1;
            if (i + 1 == num) num_tp = dir;
        }

        for (int i = (num - 1) / w; i < arr.length; i++) {
            if (arr[i][num_tp] != 0) answer++;
        }

        return answer;
    }
}
