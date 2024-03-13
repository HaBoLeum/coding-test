import java.util.*;
class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        List<Integer> list = new ArrayList<Integer>();
        int num = x;
        int sum = 0;
        
        while(num>0) {
            list.add(num%10);
            System.out.print(num%10);
            num /=10;
        }
        
        for(int i=0; i<list.size(); i++){
            sum += list.get(i);
        }
        
        if(x%sum==0) {
            answer=true;
        } else {
            answer=false;
        }
        
        return answer;
    }
}