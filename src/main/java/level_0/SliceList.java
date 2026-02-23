package level_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SliceList {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1️⃣ n 입력
        int n = Integer.parseInt(br.readLine());

        // 2️⃣ slicer 입력 (3개)
        int[] slicer = new int[3];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 3; i++) {
            slicer[i] = Integer.parseInt(st.nextToken());
        }

        // 3️⃣ num_list 입력
        String[] input = br.readLine().split(" ");
        int[] num_list = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            num_list[i] = Integer.parseInt(input[i]);
        }

        System.out.println(Arrays.toString(solution(n, slicer, num_list)));
    }

    public static int[] solution(int n, int[] slicer, int[] num_list) {
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];

        int start = a;
        int end = b;
        int step = 1;

        switch(n) {
            case 1: start = 0;                      break;
            case 2: end = num_list.length - 1;      break;
            case 4: step = c;                       break;
        }

        int size = (end - start) / step + 1;
        int[] answer = new int[size];

        int idx = 0;
        for (int i = start; i <= end; i += step) {
            answer[idx++] = num_list[i];
        }

        return answer;
    }
}
