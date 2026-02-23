package level_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

public class DateComparator {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫 번째 날짜 입력
        String[] input1 = br.readLine().split(" ");
        int[] date1 = new int[3];

        for (int i = 0; i < 3; i++) {
            date1[i] = Integer.parseInt(input1[i]);
        }

        // 두 번째 날짜 입력
        String[] input2 = br.readLine().split(" ");
        int[] date2 = new int[3];

        for (int i = 0; i < 3; i++) {
            date2[i] = Integer.parseInt(input2[i]);
        }

        System.out.println(solution(date1, date2));
    }

    public static int solution(int[] date1, int[] date2) {
        LocalDate ld1 =  LocalDate.of(date1[0], date1[1], date1[2]);
        LocalDate ld2 =  LocalDate.of(date2[0], date2[1], date2[2]);

        return ld1.isBefore(ld2) ? 1 : 0;
    }
}
