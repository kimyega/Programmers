package level1.test_92334;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ReportResult {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] id_list = br.readLine().split(" ");
        String[] report = br.readLine().split(" ");

        int k = Integer.parseInt(br.readLine());

        System.out.println(Arrays.toString(solution(id_list, report, k)));
    }

    public static int[] solution(String[] id_list, String[] report, int k) {

        Map<String, Set<String>> reportedMap = new HashMap<>();

        for (String r : report) {

            String[] split = r.split(" ");

            String from = split[0];
            String to = split[1];

            reportedMap.putIfAbsent(to, new HashSet<>());
            reportedMap.get(to).add(from);
        }

        Map<String, Integer> result = new HashMap<>();

        for (String key : reportedMap.keySet()) {

            Set<String> reporters = reportedMap.get(key);

            if (reporters.size() >= k) {

                for (String user : reporters) {
                    result.put(user, result.getOrDefault(user, 0) + 1);
                }
            }
        }

        return Arrays.stream(id_list)
                .mapToInt(x -> result.getOrDefault(x, 0))
                .toArray();
    }


}
