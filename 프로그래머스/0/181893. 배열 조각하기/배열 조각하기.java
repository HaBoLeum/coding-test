import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        int[] answer = {};
        List<Integer> list = new ArrayList<Integer>();

        for(int i =0; i<arr.length; i++) {
            list.add(arr[i]);
        }
        
        for(int i = 0; i<query.length; i++) {
            if(i%2==0) {
                int num = list.size()-query[i]-1;
                for(int j=0; j<num; j++) {
                    list.remove(query[i]+1);
                }
            } else {
                for(int j=0; j<query[i]; j++) {
                    list.remove(0);
                }
            }
        }
        
        
        return answer=list.stream().mapToInt(Integer::intValue).toArray();
    }
}