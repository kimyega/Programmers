package level_0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayElementRemover {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arrStr = sc.nextLine().split(" ");
        int[] arr = new int[arrStr.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(arrStr[i]);
        }

        String[] delStr = sc.nextLine().split(" ");
        int[] delete_list = new int[delStr.length];
        for (int i = 0; i < delete_list.length; i++) {
            delete_list[i] = Integer.parseInt(delStr[i]);
        }

        System.out.println(Arrays.toString(solution(arr, delete_list)));

    }
    static int[] solution(int[] arr, int[] delete_list) {

        List<Integer> arrList = new ArrayList<>();
        for (int num : arr ) {
            arrList.add(num);
        }

        List<Integer> delList = new ArrayList<>();
        for (int num : delete_list) {
            delList.add(num);
        }

        arrList.removeAll(delList);

        int[] answer = new int[arrList.size()];
        for (int i = 0; i < arrList.size(); i++) {
            answer[i] = arrList.get(i);
        }

        return answer;
    }
}
