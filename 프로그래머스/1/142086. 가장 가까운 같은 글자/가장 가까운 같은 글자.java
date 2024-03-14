class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        int count = 0;
        String[] str = s.split("");
        
        for(int i=0; i<str.length; i++) {
            count=0;
            if(i==0) {
                answer[i]=-1;
            } else {
                for(int j=i-1; j>=0; j--) {
                    count++;
                    if(str[i].equals(str[j])) {
                        answer[i]=count;
                        break;
                    } else {
                      answer[i]=-1;  
                    } 
                }
            }
            
        }
        
        
        return answer;
    }
}