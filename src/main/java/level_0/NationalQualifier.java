package level_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class NationalQualifier {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] rank = new int[n];
        boolean[] attendance = new boolean[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            rank[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            attendance[i] = Boolean.parseBoolean(st.nextToken());
        }

        int result = solution(rank, attendance);
        System.out.println(result);
    }

    public static int solution(int[] rank, boolean[] attendance) {

        Map<Integer, Integer> map = new TreeMap<>();

        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]) map.put(rank[i], i);
        }

        Iterator<Integer> it = map.values().iterator();

        int a = it.next(), b = it.next(), c = it.next();

        return 10000 * a +  100 * b + c;
    }
}
