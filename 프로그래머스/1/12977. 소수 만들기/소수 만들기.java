class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        boolean temp = true;
        for(int i =0; i<nums.length-2; i++) {
            for(int j=i+1; j<nums.length-1; j++) {
                for(int x=j+1; x<nums.length; x++) {
                    int num = nums[i]+nums[j]+nums[x];
                    temp = true;
                    if(num%2!=0) {
                        for(int y=2; y<=Math.sqrt(num)/1; y++) {
                            if(num%y==0) temp = false;
                        }
                        if(temp) answer++;
                    } 
                }
            }
        }

        return answer;
    }
}