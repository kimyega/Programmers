package level1.test_118666;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class PersonalityTest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] survey = br.readLine().split(" ");

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] choices = new int[st.countTokens()];

        for (int i = 0; i < choices.length; i++) {
            choices[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(survey, choices));
    }

    public static String solution(String[] survey, int[] choices) {

        int[] scores = {3, 2, 1, 0, 1, 2, 3};

        char[][] pType = {{'R', 'T'}, {'C', 'F'}, {'J', 'M'}, {'A', 'N'}};

        Map<Character, Integer> pScoresMap = new HashMap<>();

        for (char[] type : pType) {
            pScoresMap.put(type[0], 0);
            pScoresMap.put(type[1], 0);
        }

        for (int i = 0; i < survey.length; i++) {
            int choice = choices[i];
            char pt = survey[i].charAt(choice < 4 ? 0 : 1);
            pScoresMap.put(pt,  pScoresMap.get(pt) + scores[choice - 1]);
        }

        StringBuilder sb = new StringBuilder();

        for (char[] p :  pType) {
            sb.append(pScoresMap.get(p[0]) >= pScoresMap.get(p[1]) ? p[0] : p[1]);
        }


        return sb.toString();
    }
}
