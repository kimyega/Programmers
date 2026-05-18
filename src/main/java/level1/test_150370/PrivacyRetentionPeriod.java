package level1.test_150370;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class PrivacyRetentionPeriod {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String today = br.readLine();
        String[] terms = br.readLine().split(" ");
        String[] privacies = br.readLine().split(" ");

        System.out.println(Arrays.toString(solution(today, terms, privacies)));
    }

    private static Map<Character, Integer> map = new HashMap<>();

    public static int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> list = new ArrayList<>();


        for (String term : terms) {
            String[] split = term.split(" ");
            map.put(split[0].charAt(0), Integer.parseInt(split[1]));
        }

        int todayValue = toDays(today);

        for (int i = 0; i < privacies.length; i++) {

            String[] split = privacies[i].split(" ");

            int privacyDay = toDays(split[0]);

            char type = split[1].charAt(0);

            int month = map.get(type);

            privacyDay += month * 28;

            if (privacyDay <= todayValue) {
                list.add(i + 1);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int toDays(String date) {

        String[] split = date.split("\\.");

        int year = Integer.parseInt(split[0]);
        int month = Integer.parseInt(split[1]);
        int day = Integer.parseInt(split[2]);

        return year * 12 * 28 + month * 28 + day;
    }
}
