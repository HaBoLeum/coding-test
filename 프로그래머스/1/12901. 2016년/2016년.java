class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] str = {"TUE", "WED", "THU", "FRI", "SAT", "SUN", "MON"};
        int num =0;
        for(int i=0; i<a; i++) {
            if(i%2==1&&i!=9&&i!=11){
                num += 31;
            } else if(i==8||i==10||i==12){
                num += 31;
            } else if(i==2){
                num += 29;
            } else {
                num +=30;
            }
        }
        
        num += b;
        num = num%7;
        
        return answer += str[num];
    }
}