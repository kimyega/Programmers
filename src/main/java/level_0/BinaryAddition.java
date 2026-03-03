package level_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinaryAddition {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String bin1 = br.readLine();
        String bin2 = br.readLine();

        System.out.println(solution(bin1, bin2));
    }

    public static String solution(String bin1, String bin2) {
        int n1 = Integer.parseInt(bin1, 2);
        int n2 = Integer.parseInt(bin2, 2);

        return Integer.toBinaryString(n1 + n2);
    }
}
