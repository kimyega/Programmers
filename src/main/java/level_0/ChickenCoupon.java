package level_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChickenCoupon {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int chicken = Integer.parseInt(br.readLine());

        System.out.println(solution(chicken));
    }

    public static int solution(int chicken) {
        int answer = 0, cupon = chicken;

        while (cupon >= 10) {
            int service  = cupon / 10;
            answer += service;

            cupon = cupon % 10 + service;
        }

        return answer;
    }

}
