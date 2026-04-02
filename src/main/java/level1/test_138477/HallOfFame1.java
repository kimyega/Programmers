package level1.test_138477;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;

public class HallOfFame1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int k = Integer.parseInt(br.readLine());

        String[] input = br.readLine().split(" ");
        int[] score = new int[input.length];

        for (int i = 0; i < score.length; i++) {
            score[i] = Integer.parseInt(input[i]);
        }

        System.out.println(Arrays.toString(solution(k, score)));
    }

    public static int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < score.length; i++) {
            pq.offer(score[i]);

            if (pq.size() > k) pq.poll();

            answer[i] = pq.peek();
        }

        return answer;
    }
}
