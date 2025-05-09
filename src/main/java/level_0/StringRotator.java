package level_0;

import java.util.Scanner;

public class StringRotator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        for (char c : a.toCharArray()) {
            System.out.println(c);
        }
    }
}
