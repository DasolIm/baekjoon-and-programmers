import java.util.*;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int [] new_numbers = new int[num2-num1+1];
        for (int i=num1; i<=num2; i++) {
            new_numbers[i - num1] = numbers[i];
        }
        return new_numbers;
    }
}