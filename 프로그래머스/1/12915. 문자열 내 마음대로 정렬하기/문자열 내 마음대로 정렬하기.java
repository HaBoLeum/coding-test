import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        String[] str = new String[strings.length];
        for(int i=0; i<strings.length; i++) {
            str[i] = strings[i].charAt(n)+"";
            str[i] += strings[i];
        }
        Arrays.sort(str);
        for(int i=0; i<str.length; i++) {
            answer[i] = str[i].substring(1, str[i].length());
        }
        
        return answer;
    }
}