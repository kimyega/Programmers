package level_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class MorseCode1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String letter = br.readLine();

        System.out.println(solution(letter));
    }

    public static String solution(String letter) {

        String[] morseArr = {
                ".-","-...","-.-.","-..",".","..-.",
                "--.","....","..",".---","-.-",".-..",
                "--","-.","---",".--.","--.-",".-.",
                "...","-","..-","...-",".--","-..-",
                "-.--","--.."
        };

        Map<String, String> morse = new HashMap<>();

        for (int i = 0; i < morseArr.length; i++) {
            morse.put(morseArr[i], String.valueOf((char) ('a' + i)));
        }

        String[] letterArr = letter.split(" ");

        StringBuilder sb = new StringBuilder();

        for (String s : letterArr) {
            sb.append(morse.get(s));
        }

        return sb.toString();
    }
}
