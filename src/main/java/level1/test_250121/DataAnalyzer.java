package level1.test_250121;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class DataAnalyzer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 데이터 개수
        int n = Integer.parseInt(br.readLine());

        int[][] data = new int[n][4];

        // 데이터 입력
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 4; j++) {
                data[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 조건 입력
        String ext = br.readLine();       // 기준 컬럼
        int val_ext = Integer.parseInt(br.readLine()); // 기준 값
        String sort_by = br.readLine();   // 정렬 기준

        int[][] result = solution(data, ext, val_ext, sort_by);

        // 결과 출력
        for (int[] row : result) {
            for (int x : row) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }

    public static int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {

        int idx = getIdx(ext), sortIdx = getIdx(sort_by);

        List<int[]> list = new ArrayList<>();

        for (int[] d : data) {
            if (d[idx] < val_ext) list.add(d);
        }

        list.sort(Comparator.comparingInt(a -> a[sortIdx]));


        return list.toArray(new int[list.size()][]);
    }

    private static int getIdx(String col) {
        return col.equals("code") ? 0 : col.equals("date") ? 1 : col.equals("maximum") ? 2 : 3;
    }
}
