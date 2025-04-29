package level_0;

import java.util.Scanner;

public class DiceAmount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        String[] boxStr = line.split(" ");
        int[] box = new int[boxStr.length];

        for (int i = 0; i < boxStr.length; i++) {
            box[i] = Integer.parseInt(boxStr[i]);
        }

        int n = sc.nextInt();

        System.out.println(solution(box, n));
    }
    static int solution(int[] box, int n) {
        int answer = 1;
        for (int l : box) {
            answer *= l / n;
        }
        return answer;
    }
}
