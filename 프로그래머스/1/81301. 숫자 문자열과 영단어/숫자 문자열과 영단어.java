import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] str = s.split("");
        char[] c = s.toCharArray();
        String st = "";
        
        for(int i=0; i<str.length; i++) {
            if(i+1==str.length) {
                st += str[i];
                break;
            } else if(c[i]>=48&&c[i]<=57) {
                st += str[i];
            } else if((str[i]+str[i+1]).equals("ze")) {
                st += "0";
                i+=3;
            } else if((str[i]+str[i+1]).equals("fo")) {
                st += "4";
                i+=3;
            } else if((str[i]+str[i+1]).equals("fi")) {
                st += "5";
                i+=3;
            } else if((str[i]+str[i+1]).equals("ni")) {
                st += "9";
                i+=3;
            } else if((str[i]+str[i+1]).equals("on")) {
                st += "1";
                i+=2;
            } else if((str[i]+str[i+1]).equals("tw")) {
                st += "2";
                i+=2;
            } else if((str[i]+str[i+1]).equals("si")) {
                st += "6";
                i+=2;
            } else if((str[i]+str[i+1]).equals("th")) {
                st += "3";
                i+=4;
            } else if((str[i]+str[i+1]).equals("se")) {
                st += "7";
                i+=4;
            } else if((str[i]+str[i+1]).equals("ei")) {
                st += "8";
                i+=4;
            }
        }
        
        return answer = Integer.parseInt(st);
    }
}