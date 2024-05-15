import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int num = sc.nextInt();
        
        for (int i=0; i<num; i++) {
            System.out.print(str);
        }
        
        sc.close();
    }
}