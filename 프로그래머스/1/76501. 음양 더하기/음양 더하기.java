class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i=0; i<signs.length; i++) {
            if(!signs[i]){
                absolutes[i] = 0-absolutes[i];
            }
        }
        
        for(int i=0; i<absolutes.length; i++) {
            answer += absolutes[i];
        }
        
        return answer;
    }
}