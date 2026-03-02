package level_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CountCharacters {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String my_string = br.readLine();

        System.out.println(Arrays.toString(solution(my_string)));
    }

    public static int[] solution(String my_string) {
        int[] alphabet = new int[52];

        for (char c : my_string.toCharArray()) {
            if (Character.isUpperCase(c)) alphabet[c - 'A']++;
            else alphabet[c - 'a' + 26]++;
        }

        return alphabet;
    }
}
