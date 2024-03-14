import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        
        char[] chr = s.toCharArray();
        int count =0;
        for(int i=0; i<chr.length;i++) {
            if(chr[i]==32) {
                count=0;
            } else if(count%2==0) {
                count++;
                if(chr[i]>=97&&chr[i]<=122){
                    chr[i] -=32;
                }   
            } else  {
                count++;
                if(chr[i]>=65&&chr[i]<=90) {
                    chr[i] +=32;
                }
            }   
        }
        return answer=String.valueOf(chr);
    }
}