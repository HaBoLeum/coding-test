import java.util.*;
class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        List<Integer> list = new ArrayList<Integer>();
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        double num = 0;
        Collections.sort(list);
        
        if(list.get(1)==list.get(2)) {
            if(list.get(0)==list.get(3)){
                answer = 1111 * list.get(0);
            } else if(list.get(0)==list.get(1)) {
                num = Math.pow((10*list.get(1)+list.get(3)), 2);
                answer = (int)Math.floor(num);
            }else if(list.get(3)==list.get(1)) {
                num = Math.pow((10*list.get(1)+list.get(0)), 2);
                answer = (int)Math.floor(num);
            } else {
                answer = list.get(0)*list.get(3);
            }
        } else if(list.get(0)==list.get(1)) {
            if(list.get(2)==list.get(3)) {
                answer = (list.get(0)+list.get(2)) * Math.abs(list.get(0)-list.get(2));
            } else{
                answer = list.get(2)*list.get(3);
            }
        } else if(list.get(2)==list.get(3)) {
            answer = list.get(0)*list.get(1);
        } else {
            answer = list.get(0);
        }
        
        return answer;
    }
}