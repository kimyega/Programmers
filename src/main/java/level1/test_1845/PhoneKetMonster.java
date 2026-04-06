package level1.test_1845;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class PhoneKetMonster {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] nums = new int[st.countTokens()];

        for (int i = 0; i < nums.length; i++) nums[i] = Integer.parseInt(st.nextToken());

        System.out.println(solution(nums));
    }

    public static int solution(int[] nums) {
        return Math.min(nums.length / 2, Arrays.stream(nums).boxed().collect(Collectors.toSet()).size());
    }
}
