class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        
        switch(eq) {
            case "!":
                if (ineq.equals(">")) {
                    if(n>m) answer++;
                } else if(ineq.equals("<")) {
                    if(n<m) answer++;
                }
                break;
            case "=":
                if (ineq.equals(">")) {
                    if(n>=m) answer++;
                } else if(ineq.equals("<")) {
                    if(n<=m) answer++;
                }
                break;
        }
        
        return answer;
    }
}