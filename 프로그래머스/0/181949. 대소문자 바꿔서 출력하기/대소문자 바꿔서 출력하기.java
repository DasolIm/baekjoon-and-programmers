import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        UpperOrLower(a);

        sc.close();
    }

    public static void UpperOrLower(String str) {
        for (int i=0; i<str.length(); i++) {
            char temp = str.charAt(i);
            String s = "";
            if (65 <= temp && temp <= 90) {
                s = String.valueOf(temp).toLowerCase();
            } else {
                s = String.valueOf(temp).toUpperCase();
            }
            System.out.print(s);
        }
    }
}