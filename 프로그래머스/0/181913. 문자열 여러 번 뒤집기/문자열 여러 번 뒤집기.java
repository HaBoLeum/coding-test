class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        String[] sarr = my_string.split("");
        
        for(int i=0; i<queries.length; i++){
            int start = queries[i][0];
            int end = queries[i][1];
            String[] arr = new String[end-start+1];
            int count=0;
            for(int j=end; j>=start; j--){
                arr[count++] = sarr[j];
            }
            count=0;
            for(int j=start; j<=end; j++) {
                sarr[j] = arr[count++];   
            }
        }
        
        answer = String.join("", sarr);
        
        return answer;
    }
}