class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        
        if((x1||x2)&&(x3||x4)) {
            answer=true;
        } else{
            answer=false;
        }
        
        return answer;
    }
}