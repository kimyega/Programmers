package level1.test_172928;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ParkWalk {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] park = br.readLine().split(" ");

        int n = Integer.parseInt(br.readLine());
        String[] routes =  new String[n];

        for (int i = 0; i < n; i++) {
            routes[i] = br.readLine();
        }

        System.out.println(Arrays.toString(solution(park, routes)));
    }

    public static int[] solution(String[] park, String[] routes) {

        int x = -1, y = -1, h = park.length, w = park[0].length();

        for (int i = 0; i < h; i++) {
            if (park[i].contains("S")) {
                x = park[i].indexOf("S");
                y = i;
                break;
            }
        }

        String dirs = "EWSN";
        int[][] ops = {
                {1, 0},
                {-1, 0},
                {0, 1},
                {0, -1}
        };


        for (String route : routes) {

            char dir = route.charAt(0);
            int num = Integer.parseInt(route.substring(2));

            int[] op = ops[dirs.indexOf(dir)];

            boolean canMove = true;

            for (int i = 1; i <= num; i++) {

                int nx = x + op[0] * i;
                int ny = y + op[1] * i;

                if (nx < 0 || ny < 0 || nx >= w || ny >= h
                        || park[ny].charAt(nx) == 'X') {

                    canMove = false;
                    break;
                }
            }

            if (canMove) {
                x += op[0] * num;
                y += op[1] * num;
            }
        }

        return new int[]{y, x};
    }

}
