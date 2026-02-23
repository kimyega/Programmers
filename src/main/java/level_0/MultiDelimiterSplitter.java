package level_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MultiDelimiterSplitter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String myStr =  br.readLine();

        System.out.println(Arrays.toString(solution(myStr)));
    }

    public static String[] solution(String myStr) {
        String myRpa = myStr.replaceAll("[abc]+", " ").trim();
        return myRpa.isBlank() ? new String[]{"EMPTY"} : myRpa.split(" ");
    }
}
