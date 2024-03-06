class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        for(int i=0; i<queries.length; i++){
            int num= 1000000;
            for(int j=0; j<arr.length; j++){
                if(queries[i][0]<=j && j<=queries[i][1]) {
                    if(queries[i][2]<arr[j]) {
                        if(arr[j]<num) {
                            num = arr[j];
                        }
                    }
                }
                if(num==1000000) {
                    answer[i]=-1;
                } else {
                    answer[i]=num;
                }
            }
        }
        
        
        return answer;
    }
}