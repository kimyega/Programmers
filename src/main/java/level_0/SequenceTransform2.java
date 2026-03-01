package level_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SequenceTransform2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 한 줄 입력 받기
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 토큰 개수 = 배열 길이
        int[] arr = new int[st.countTokens()];

        int index = 0;
        while(st.hasMoreTokens()) {
            arr[index++] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(arr));
    }

    public static int solution(int[] arr) {
        int count = 0;

        while (true) {
            int[] arrNew = arr.clone();

            for (int i = 0; i < arrNew.length; i++) {
                if (arrNew[i] >= 50 && arrNew[i] % 2 == 0) arrNew[i] /= 2;
                else if (arrNew[i] < 50 && arrNew[i] % 2 != 0) arrNew[i] = arrNew[i] * 2 + 1;
            }

            if (Arrays.equals(arr, arrNew)) break;

            arr = arrNew;
            count++;
        }

        return count;
    }

}
