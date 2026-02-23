package level_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TreatmentOrder {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 한 줄 입력
        String[] input = br.readLine().split(" ");
        int[] emergency = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            emergency[i] = Integer.parseInt(input[i]);
        }

        System.out.println(Arrays.toString(solution(emergency)));
    }

    public static int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];

        for(int i = 0; i < answer.length; i++){
            if(answer[i] != 0){
                continue;
            }
            int idx = 1;
            for(int j = 0; j < answer.length; j++){
                if(emergency[i] < emergency[j]){
                    idx++;
                }
            }
            answer[i] = idx;
        }
        return answer;
    }
}
