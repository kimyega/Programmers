package level_0;

import java.util.Scanner;

public class ClothingDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        System.out.println(solution(price));
    }
    static int solution(int price) {
        return price >= 500000 ? price * 8 / 10: price >= 300000 ? price * 9 / 10 : price >= 100000 ? price * 95 / 100 : price;
    }
}
