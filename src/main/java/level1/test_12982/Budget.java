package level1.test_12982;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Budget {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 배열 입력 받기 (예: 1 3 2 5)
        System.out.println("배열 d를 공백으로 구분하여 입력하세요:");
        String[] input = br.readLine().split(" ");
        int[] d = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            d[i] = Integer.parseInt(input[i]);
        }

        // 예산 입력 받기
        System.out.println("예산 budget을 입력하세요:");
        int budget = Integer.parseInt(br.readLine());

        // 함수 호출 후 결과 출력
        System.out.println(solution(d, budget));
    }

    public static int solution(int[] d, int budget) {
        int answer = 0;

        Arrays.sort(d);

        for (int num : d) {
            budget -= num;
            if (budget < 0) break;
            answer++;
        }
        return answer;
    }
}
