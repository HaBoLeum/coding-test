import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        int[] ar = Arrays.stream(arr).distinct().toArray();
        
        for(int i=0; i<ar.length; i++) {
            if(i<k){
            answer[i] = ar[i];    
            }
        }
        if(ar.length<k) {
            for(int i= ar.length; i<k; i++){
                answer[i] = -1;
            }
        }
        
        return answer;
    }
}