package level_0;

import java.io.IOException;
import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();

        System.out.println(str.repeat(n));
    }
}
