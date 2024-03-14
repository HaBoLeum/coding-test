import java.util.*;
class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        char[] chr = s.toCharArray();
        
        for(int i=0; i<chr.length; i++) {
            if(chr[i]>=65&&chr[i]<=90) {
                chr[i] += n;
                if(chr[i]>90) {
                    int num = chr[i]-90+64;
                    chr[i] = (char)num;
                }
            } else if(chr[i]>=97&&chr[i]<=122){
                chr[i] += n;
                if(chr[i]>122) {
                    int num = chr[i]-122+96;
                    chr[i] = (char)num;
                }
            }
        }
        
        return answer = String.valueOf(chr);
    }
}