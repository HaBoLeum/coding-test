class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i =0; i<n; i++) {
            answer[i] = Integer.toBinaryString(arr1[i]|arr2[i]);
            String str = "";
            if(answer[i].length()<n){
                for(long j=0; j<n-answer[i].length(); j++){
                    str += "0";
                }
                answer[i] = str + answer[i];
            }
        }
        
        for(int i=0; i<n; i++) {
            answer[i]=answer[i].replaceAll("0", " ");
            answer[i]=answer[i].replaceAll("1", "#");
        }
        
        return answer;
    }
}