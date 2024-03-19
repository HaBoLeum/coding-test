import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] num = new int[3];
        int[] num1 = {1, 2, 3, 4, 5};
        int[] num2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] num3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int count1=0, count2=0, count3=0;
        for(int i=0; i<answers.length; i++) {
            if(num1[i%5]==answers[i])  count1++;
            if(num2[i%8]==answers[i])  count2++;
            if(num3[i%10]==answers[i])  count3++;
        }
        num[0] = count1*10+1;
        num[1] = count2*10+2;
        num[2] = count3*10+3;
        Arrays.sort(num);
        
        if(num[0]/10==num[2]/10) {
            int[] temp = new int[3];
            for(int i=0; i<3; i++) temp[i] = num[i]%10;
            answer = temp;
        } else if(num[1]/10==num[2]/10) {
            int[] temp = new int[2];
            for(int i=1; i<3; i++) temp[i-1] = num[i]%10;
            answer = temp;
        } else {
            int[] temp = {num[2]%10};
            answer = temp;
        }
        
        return answer;
    }
}