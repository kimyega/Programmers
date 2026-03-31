package level1.test_12969;

import java.io.IOException;
import java.util.Scanner;

public class RectangleStars {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        String st = "*";
        System.out.println((st.repeat(a) + "\n").repeat(b));
    }
}
