package level1.test_340213;

import java.util.Scanner;

public class VideoPlayer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String video_len = sc.nextLine();
        String pos = sc.nextLine();
        String op_start = sc.nextLine();
        String op_end = sc.nextLine();

        int n = sc.nextInt();
        sc.nextLine();

        String[] commands = new String[n];
        for (int i = 0; i < n; i++) {
            commands[i] = sc.nextLine();
        }

        String result = solution(video_len, pos, op_start, op_end, commands);
        System.out.println(result);
    }
    public static int getSec(String time) {
        return Integer.parseInt(time.split(":")[0]) * 60 + Integer.parseInt(time.split(":")[1]);
    }

    public static String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int video_len_sec = getSec(video_len), pos_sec = getSec(pos), op_start_sec = getSec(op_start), op_end_sec = getSec(op_end);

        if (pos_sec >= op_start_sec && pos_sec <= op_end_sec) pos_sec = op_end_sec;

        for (String command : commands) {
            if (command.equals("prev")) {
                pos_sec = pos_sec < 10 ? 0 : pos_sec - 10;
            } else if (command.equals("next")) {
                pos_sec = video_len_sec - pos_sec < 10 ? video_len_sec : pos_sec + 10;
            }

            if (pos_sec >= op_start_sec && pos_sec <= op_end_sec) pos_sec = op_end_sec;
        }

        return String.format("%02d:%02d", pos_sec / 60, pos_sec % 60);
    }
}
