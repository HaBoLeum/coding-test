class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        for(int i =0; i<arr.length; i++) {
            for(int x=0; x<queries.length; x++){
                
                    if(queries[x][0]<=i&&queries[x][1]>=i){
                        arr[i] +=1;
                    
                }
            }
        }
        answer = arr;
        return answer;
    }
}