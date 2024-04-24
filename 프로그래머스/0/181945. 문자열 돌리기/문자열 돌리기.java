import java.util.Scanner;

public class Solution {
    public static void turnString(String str) {
        for (int i=0; i<str.length(); i++) {
            char temp = str.charAt(i);
            System.out.println(temp);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        turnString(a);
        sc.close();
    }
}