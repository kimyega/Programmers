package level1.test_178871;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RaceGame {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] players = br.readLine().split(" ");
        String[] callings =  br.readLine().split(" ");

        System.out.println(Arrays.toString(solution(players, callings)));
    }

    public static String[] solution(String[] players, String[] callings) {

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }

        for (int i = 0; i < callings.length; i++) {
            int idx =  map.get(callings[i]);

            String front = players[idx - 1];
            players[idx - 1] = callings[i];
            players[idx] = front;

            map.put(callings[i], idx - 1);
            map.put(front, idx);
        }

        return players;
    }
}
