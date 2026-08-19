package level1.test_258712;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MostReceivedGift {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 친구 수
        int friendCount = sc.nextInt();
        sc.nextLine();

        // 친구 이름 입력
        String[] friends = new String[friendCount];
        for (int i = 0; i < friendCount; i++) {
            friends[i] = sc.next();
        }

        // 선물 기록 개수
        int giftCount = sc.nextInt();
        sc.nextLine();

        // 선물 기록 입력
        String[] gifts = new String[giftCount];
        for (int i = 0; i < giftCount; i++) {
            gifts[i] = sc.nextLine();
        }

        int result = solution(friends, gifts);

        System.out.println(result);

        sc.close();
    }


    public static int solution(String[] friends, String[] gifts) {
        int answer = 0;

        Map<String, Integer> idxMap = new HashMap<>();

        for (int i = 0; i < friends.length; i++) {
            idxMap.put(friends[i], i);
        }

        int[][] gives = new int[friends.length][friends.length];
        int[] giftScore = new int[friends.length];

        for (String gift : gifts) {
            String[] con = gift.split(" ");

            int from = idxMap.get(con[0]);
            int to = idxMap.get(con[1]);

            gives[from][to]++;
            giftScore[from]++;
            giftScore[to]--;
        }

        for (int i = 0; i < friends.length; i++) {
            int count = 0;
            for (int j = 0; j < friends.length; j++) {
                if (i == j) continue;

                if (gives[i][j] > gives[j][i]) {
                    count++;
                } else if (gives[i][j] == gives[j][i]) {
                    if (giftScore[i] > giftScore[j]) {
                        count++;
                    }
                }
            }

            answer = Math.max(answer, count);
        }

        return answer;
    }
}
