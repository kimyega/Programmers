package level1.test_388351;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FlexibleWork {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // schedules 입력
        int n = Integer.parseInt(br.readLine());

        int[] schedules = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            schedules[i] = Integer.parseInt(st.nextToken());
        }

        // timelogs 입력
        int[][] timelogs = new int[n][7];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < 7; j++) {
                timelogs[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // startday 입력
        int startday = Integer.parseInt(br.readLine());

        // 함수 호출

        int result = solution(schedules, timelogs, startday);

        System.out.println(result);
    }

    public static int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;

        for (int i = 0; i < timelogs.length; i++) {
            boolean isLate = false;
            int day = startday;
            for (int time : timelogs[i]) {
                if (day % 7 != 0 && day % 7 != 6 && addTenMinutes(schedules[i]) < time) {
                    isLate = true;
                    break;
                }
                day++;
            }
            if (!isLate) answer++;
        }
        return answer;
    }

    private static int addTenMinutes(int time) {
        int hour = time / 100;
        int minute = time % 100 + 10;
        hour += minute / 60;
        return hour * 100 + minute % 60;
    }
}
