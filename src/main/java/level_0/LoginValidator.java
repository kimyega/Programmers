package level_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LoginValidator {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        // 1️⃣ id_pw 입력
        String[] id_pw = br.readLine().split(" ");

        // 2️⃣ db 행 개수 입력
        int n = Integer.parseInt(br.readLine());

        // 3️⃣ db 배열 생성
        String[][] db = new String[n][2];

        for (int i = 0; i < n; i++) {
            db[i] = br.readLine().split(" ");
        }

        // 4️⃣ 결과 출력
        System.out.println(solution(id_pw, db));
    }

    public static String solution(String[] id_pw, String[][] db) {

        boolean idCorrect = false, pwCorrect = false;

        for (String[] strings : db) {
            if (strings[0].equals(id_pw[0])) {
                idCorrect = true;
                if (strings[1].equals(id_pw[1])) pwCorrect = true;
            }
        }

        return idCorrect ? pwCorrect ? "login" : "wrong pw" : "fail";
    }
}
