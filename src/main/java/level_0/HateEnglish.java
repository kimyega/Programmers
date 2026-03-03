package level_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HateEnglish {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String numbers = br.readLine();

        System.out.println(solution(numbers));
    }

    public static long solution(String numbers) {
        String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < arr.length; i++) {
            numbers = numbers.replace(arr[i], i + "");
        }

        return Long.parseLong(numbers);
    }
}
