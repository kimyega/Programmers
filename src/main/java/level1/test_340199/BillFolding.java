package level1.test_340199;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BillFolding {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        // wallet 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] wallet = new int[2];
        wallet[0] = Integer.parseInt(st.nextToken());
        wallet[1] = Integer.parseInt(st.nextToken());

        // bill 입력
        st = new StringTokenizer(br.readLine());
        int[] bill = new int[2];
        bill[0] = Integer.parseInt(st.nextToken());
        bill[1] = Integer.parseInt(st.nextToken());

        // 함수 호출
        int result = solution(wallet, bill);
        System.out.println(result);

    }

    public static int solution(int[] wallet, int[] bill) {
        int answer = 0;

        Arrays.sort(wallet);

        while (true) {
            Arrays.sort(bill);

            if (bill[0] <= wallet[0] && bill[1] <= wallet[1]) break;

            bill[bill[1] > bill[0] ? 1 : 0] /= 2;

            answer++;
        }

        return answer;
    }
}
