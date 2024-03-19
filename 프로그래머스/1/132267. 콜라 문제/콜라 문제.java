class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int num = 0;
        int remain = 0;
        boolean temp = true;
        
        while(n>=b) {
            num=0;
            if(n%a==0) {
                num = (n/a)*b;
                answer+=num;
                n = num;
            } else {
                n += remain;
                if(n/a==0){
                    temp = false;
                }
                num = (n/a)*b;
                answer += num;
                remain = n%a;
                n = num;
            } 
        }
        
        return answer;
    }
}