import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int[] num = {};
        int count = 0;
        for(int i=0; i<attendance.length; i++) {
            if(attendance[i]) {
                count++;
            }
        }
        num = new int[count];
        count=0;
        for(int i=0; i<attendance.length; i++) {
            if(attendance[i]) {
                num[count++] = rank[i];
            }
        }
        Arrays.sort(num);
        
        for(int i=0; i<rank.length; i++) {
            if(num[0]==rank[i]) {
                answer += 10000 * i;
            } else if(num[1]==rank[i]) {
                answer += 100 * i;
            } else if(num[2]==rank[i]) {
                answer += i;
            }
        }
        
        return answer;
    }
}