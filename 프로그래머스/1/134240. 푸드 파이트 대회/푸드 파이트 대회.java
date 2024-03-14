class Solution {
    public String solution(int[] food) {
        String answer = "";
        String str = "";
        
        for(int i=1; i<food.length; i++) {
            for(int j=0; j<food[i]/2; j++) {
                answer += i;
            }
        }
        
        for(int i=answer.length()-1; i>=0; i--) {
            str = str + answer.charAt(i);
        }
        
        
        return answer = answer + "0" + str;
    }
}