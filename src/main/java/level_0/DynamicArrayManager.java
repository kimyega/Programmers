package level_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DynamicArrayManager {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // arr 입력
        String[] arrInput = br.readLine().split(" ");
        int[] arr = new int[arrInput.length];

        for (int i = 0; i < arrInput.length; i++) {
            arr[i] = Integer.parseInt(arrInput[i]);
        }

        // flag 입력
        String[] flagInput = br.readLine().split(" ");
        boolean[] flag = new boolean[flagInput.length];

        for (int i = 0; i < flagInput.length; i++) {
            flag[i] = Boolean.parseBoolean(flagInput[i]);
        }

        System.out.println(Arrays.toString(solution(arr, flag)));
    }

    public static int[] solution(int[] arr, boolean[] flag) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (flag[i]) {
                list.addAll(Collections.nCopies(arr[i] * 2, arr[i]));
            } else {
                list.subList(list.size() - arr[i], list.size()).clear();
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
