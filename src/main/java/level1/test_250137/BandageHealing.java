package level1.test_250137;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BandageHealing {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // bandage 입력
        // 예: 5 1 5
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] bandage = new int[3];

        for (int i = 0; i < 3; i++) {
            bandage[i] = Integer.parseInt(st.nextToken());
        }

        // health 입력
        // 예: 30
        int health = Integer.parseInt(br.readLine());

        // attacks 개수 입력
        // 예: 5
        int n = Integer.parseInt(br.readLine());

        // attacks 입력
        // 예:
        // 2 10
        // 9 15
        int[][] attacks = new int[n][2];

        for (int i = 0; i < n; i++) {

            st = new StringTokenizer(br.readLine());

            attacks[i][0] = Integer.parseInt(st.nextToken());
            attacks[i][1] = Integer.parseInt(st.nextToken());
        }

        int result = solution(bandage, health, attacks);

        System.out.println(result);
    }

    public static int solution(int[] bandage, int health, int[][] attacks) {

        int maxHealth = health, time = 0;

        for (int[] attack : attacks) {
            int healTime = attack[0] - time - 1;
            health += healTime * bandage[1] + healTime / bandage[0] * bandage[2];

            if (health > maxHealth) health = maxHealth;
            health -= attack[1];
            time = attack[0];

            if (health <= 0) return -1;
        }

        return health;
    }
}
