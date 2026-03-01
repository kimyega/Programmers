package level_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeDelivery {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] order = br.readLine().split(" ");

        System.out.println(solution(order));
    }

    public static int solution(String[] order) {
        int count = 0;

        for (String s : order) {
            if (s.contains("cafelatte")) count += 5000;
            else count += 4500;
        }

        return count;
    }
}
