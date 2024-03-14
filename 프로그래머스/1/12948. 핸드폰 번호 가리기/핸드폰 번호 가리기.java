class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int num = phone_number.length();
        for(int i=0; i<num; i++) {
            if(num-i<=4) {
                answer += phone_number.charAt(i)+"";
            } else {
                answer += "*";
            }
        }
        
        return answer;
    }
}