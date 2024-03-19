import java.util.*;
class Solution {
    public String solution(String[] seoul) {
        List<String> list = new ArrayList<String>(Arrays.asList(seoul));
        int index = list.indexOf("Kim");
        String answer = "김서방은 " + index + "에 있다";
        return answer;
    }
}