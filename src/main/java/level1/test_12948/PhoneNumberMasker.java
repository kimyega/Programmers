package level1.test_12948;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PhoneNumberMasker {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String phone_number = br.readLine();

        System.out.println(solution(phone_number));
    }

    public static String solution(String phone_number) {
        int maskIdx = phone_number.length() - 4;
        return "*".repeat(maskIdx) + phone_number.substring(maskIdx);
    }
}
