package level_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlienDictionary {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] spells = br.readLine().split(" ");
        String[] dic =  br.readLine().split(" ");

        System.out.println(solution(spells, dic));
    }

    public static int solution(String[] spell, String[] dic) {

        for (String d : dic) {
            boolean flag = true;

            for (String sp : spell) {
                if (d.indexOf(sp.charAt(0)) == -1) {
                    System.out.println(d + "::" + sp + " :" + d.indexOf(sp.charAt(0)));
                    flag = false;
                    break;
                }
            }

            if (flag) return 1;
        }

        return 2;
    }
}
