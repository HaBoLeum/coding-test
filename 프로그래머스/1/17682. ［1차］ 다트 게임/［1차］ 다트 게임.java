class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        String[] str = dartResult.split("");
        int[] num = new int[3];
        String[] point = {"", "", ""};
        int count = 0;
        for(int i=0; i<str.length; i++) {
            if(str[i].equals("S")||str[i].equals("D")||str[i].equals("T")){
                point[count-1] = point[count-1] + str[i];
            } else if(str[i].equals("*")||str[i].equals("#")){
                point[count-1] = point[count-1] + str[i];
                if(str[i].equals("*")&&count>=2){
                    point[count-2] = point[count-2] + str[i];
                }   
            } else {
                if(str[i].equals("1")){
                    if(str[i+1].equals("0")){
                        String temp = str[i]+str[i+1];
                        num[count++] = Integer.parseInt(temp);
                        i++;
                    } else{
                        num[count++] = Integer.parseInt(str[i]);
                    }
                } else {
                    num[count++] = Integer.parseInt(str[i]);
                }
            }
        }
        
        for(int i=0;i<num.length; i++) {
            String[] st = point[i].split("");
            for(int x=0; x<st.length; x++) {
                if(st[x].equals("S")){
                } else if(st[x].equals("D")) {
                    num[i] = (int)Math.pow(num[i], 2);
                } else if(st[x].equals("T")) {
                    num[i] = (int)Math.pow(num[i], 3);
                } else if(st[x].equals("*")) {
                    num[i] = num[i]*2;
                } else if(st[x].equals("#")) {
                    num[i] = num[i]*-1;
                }
            }
            answer+=num[i];
        }
        
        
        return answer;
    }
}