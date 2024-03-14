class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int len = p.length();
        for(int i=0; i<t.length(); i++){
            if(i+len>t.length()) break;
            if(Long.parseLong(t.substring(i, i+len))<=Long.parseLong(p)) answer++;
        }
        return answer;
    }
}